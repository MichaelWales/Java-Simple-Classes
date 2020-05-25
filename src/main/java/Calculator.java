public class Calculator {

    private int num1;
    private int num2;
    private double dub1;
    private double dub2;

    public Calculator(int num1, int num2, double dub1, double dub2) {
        this.num1 = num1;
        this.num2 = num2;
        this.dub1 = dub1;
        this.dub2 = dub2;
    }

    public int add() {
        return this.num1 + this.num2;
    }

    public int subtract() {
        return this.num1 - this.num2;
    }

    public int multiply() {
        return this.num1 * this.num2;
    }

    public double divide() {
        return this.dub1 / this.dub2;
    }

}
