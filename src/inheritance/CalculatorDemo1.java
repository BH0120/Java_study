package inheritance;

/*
*
*  객체 지향에서 가장 중요한 것은 재활용성
*  상속(Inheritance)은 재활용성을 극대화 시킨 프로그래밍 기법
*
*  상속(inheritance)이란?  물려준다는 의미.
*  > 어떤 객체가 있을 때 그 객체의 필드(변수)와 메소드를 다른 객체가 물려 받을 수 있음.
*
* */

class Calculator {
    int left, right;

    public void setOperands (int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    public void substract(){
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo1 {
    public static void main(String[] args) {

        /*
        * 기존에 존재하는 Calculator를 c로 인스턴스화하면
        * Calculator c = new Calculator();
        *
        * substract을 실행할 수 없다.
        * substract의 정의가 Calculator 내부에 존재하지 않기 때문.
        *
        * 이를 해결하기 위해 class SubstractionableCalculator(SC라 지칭)를 생성하고
        * 뒤에 extends Calculator를 한다.
        * 이는 SC가 Calculator를 상속받는다는 의미로
        * Calculator객체가 가진 필드와 메소드를 SC가 상속받아 사용할 수 있다.
        *
        * 그렇다면, 이를 실행하고 싶다면, Calculator를 인스턴스화 없이 SC만을
        * 인스턴스화 하면 부모인 Calculator를 모두 사용할 수 있다.
        * */
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOperands(10, 20);
        c1.sum(); //30
        c1.avg(); //15
        c1.substract(); //-15
    }
}
