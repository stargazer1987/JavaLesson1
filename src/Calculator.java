public class Calculator {
    private static int ID;
    public Calculator() {
        this.ID++;
    }

    public double Multiply(double a, double b) {
        return a*b;
    }
    public double Divide(double a, double b) {return a / b;}

    public double Add(double a, double b) {return a+b;}
    public double Subtract(double a, double b) {return a-b;}

    @Override
    public String toString() {
        return "I'm calculator. My number is " + this.ID;
    }
}
