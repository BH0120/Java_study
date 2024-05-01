package inheritance.construct;

class Calculator {
    int left, right;

    //기본 생성자
//    public Calculator() {}

    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        //기존 방식
        // 기본 생성자가 필수로 존재해야함
//         this.left = left;
//         this.right = right;

        // 부모 클래스에 있는 생성자를 접근
        // 부모 클래스의 기본 생성자가 없어도 오류 발생 X
        super(left, right);
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}



public class CalculatorConstructorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
