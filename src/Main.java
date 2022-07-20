
import java.util.Scanner;

public class Main {
    private final static int MAX_VALUE=1000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Task 1
        int minValue = 1;
        int currentValue = MAX_VALUE;
        while (currentValue >= minValue) {
            System.out.print(currentValue+ " ");
            currentValue-=2;
        }
        System.out.println();
        System.out.println("-------");

        // Task 2
        String luckyNumber;
        do {
            System.out.println("Enter a 6-digit number");
            luckyNumber = scanner.next();
        } while (luckyNumber.length() != 6);

        int firstDigit = Integer.parseInt(String.valueOf(luckyNumber.charAt(0)));
        int secondDigit = Integer.parseInt(String.valueOf(luckyNumber.charAt(1)));
        int thirdDigit = Integer.parseInt(String.valueOf(luckyNumber.charAt(2)));
        int fourthDigit = Integer.parseInt(String.valueOf(luckyNumber.charAt(3)));
        int fifthDigit = Integer.parseInt(String.valueOf(luckyNumber.charAt(4)));
        int sixthDigit = Integer.parseInt(String.valueOf(luckyNumber.charAt(5)));

        if(firstDigit+secondDigit+thirdDigit == fourthDigit+fifthDigit+sixthDigit) {
            System.out.println("You've got a lucky number!");
        } else {
            System.out.println("Your number is not lucky one:(");
        }

        System.out.println("-------");

        // Task 3
        int remainder;
        int numberOfChoices = 0;
        System.out.println("Enter the total weight of the present");
        int totalWeight = scanner.nextInt();
        System.out.println("Enter the weight of the orange");
        int orangeWeight = scanner.nextInt();
        System.out.println("Enter the weight of the apple");
        int appleWeight = scanner.nextInt();
        System.out.println("Enter the weight of the pear");
        int pearWeight = scanner.nextInt();

        for(int i=0;i<totalWeight/orangeWeight+1;i++){
            remainder = totalWeight - orangeWeight*i;
            for(int j=0;j<remainder/appleWeight+1;j++){
                if((remainder-appleWeight*j)%pearWeight==0){
                    numberOfChoices++;
                }
            }
        }

        System.out.println("numberOfChoices for making the present are " + numberOfChoices);

        System.out.println("-------");

        // Task Calculator
        Calculator calculator = new Calculator();
        System.out.println(calculator);

        String firstNum;
        String secondNum;
        String operator;


        while(true) {
            Double result;

            System.out.println("Enter the first number");
            firstNum = scanner.next();
            if (firstNum.equals("stop")) {
                System.exit(1);

            }
            System.out.println("Enter the second number");
            secondNum = scanner.next();
            if (secondNum.equals("stop")) {
                System.exit(1);
            }
            System.out.println("Enter the operator");
            operator = scanner.next();
            if (operator.equals("stop")) {
                System.exit(1);

            } else if (!operator.equals("+") && !operator.equals("-") && !operator.equals("/") && !operator.equals("*")){
                System.out.println("There is no such operation");
                System.exit(1);


            }

            if(operator.equals("+")) {
                result = calculator.Add(Double.parseDouble(firstNum),Double.parseDouble(secondNum));
                System.out.println(firstNum + " + " + secondNum + " = " + result);
            } else if (operator.equals("-")) {
                result = calculator.Subtract(Double.parseDouble(firstNum),Double.parseDouble(secondNum));
                System.out.println(firstNum + " - " + secondNum + " = " + result);
            } else if (operator.equals("*")) {
                result = calculator.Multiply(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
                System.out.println(firstNum + " * " + secondNum + " = " + result);
            } else if (operator.equals("/")) {
                result = calculator.Divide(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
                if (result.equals(Double.POSITIVE_INFINITY) || result.equals(Double.NEGATIVE_INFINITY)) {
                    System.out.println("Division by Zero!");
                    System.exit(1);
                } else {
                    System.out.println(firstNum + " / " + secondNum + " = " + result);
                }
            }
        }
    }
}
