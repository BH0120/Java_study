package object;


class Calculator {
    int left, right;

    public void setOperland(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void add() {
        System.out.println(this.left + this.right);
    }

    public void subtract() {
        System.out.println(this.left - this.right);
    }

    public void multiply() {
        System.out.println(this.left * this.right);
    }

    public void divide() {
        System.out.println(this.left / this.right);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        c1.setOperland(8,4);
        c1.add();
        c1.subtract();
        c1.multiply();
        c1.divide();
        System.out.println("____________________________________");
        Calculator c2 = new Calculator();
        c2.setOperland(4,8);
        c2.add();
        c2.subtract();
        c2.multiply();
        c2.divide();


    }
}
