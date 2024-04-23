package classinstance;

class Calculator2 {
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
    public static void avg(int left, int right) {
        System.out.println((left + right)/2);
    }
}

public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator2.sum(10,20);
        Calculator2.avg(10,20);
    }
}
