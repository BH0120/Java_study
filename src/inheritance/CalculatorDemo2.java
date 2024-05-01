package inheritance;

class MultiplicationableCalculator extends Calculator {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

class DivisionableCalculator extends MultiplicationableCalculator {
    public void division() {
        System.out.println(this.left / this.right);
    }
}

/*
* 상속 + 상속
* Multiplication은 Calculator를 상속받고
* Divisionable은 Multiplication을 상속받는다.
*
* 이때 Divisionable은 부모의 부모인 Calculator의 필드와 메서드에도 접근이 가능하다.
* */


public class CalculatorDemo2 {
    public static void main(String[] args) {
        DivisionableCalculator dc = new DivisionableCalculator();
        dc.setOperands(10, 20);
        dc.sum();
        dc.avg();
        dc.multiplication();
        dc.division();
    }
}
