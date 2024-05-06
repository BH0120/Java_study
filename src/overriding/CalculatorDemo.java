package overriding;

class Calculator {
    int left, right;

    public void setOperands(int left, int right) {
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

class SubCalculator extends Calculator {
    public void sum() {
        System.out.println("실행 결과는 SubCal의 SUM()인 "+ (this.left + this.right) + "입니다.");
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        SubCalculator sc = new SubCalculator();
        sc.setOperands(10, 20);
        sc.sum();
        sc.avg();
        sc.substract();

        /*
        * Calculator와 SubCalculator에서 가지고 있는 메소드가 같을 때는
        * 하위 클래스가 정의한 내용으로 기본 동작 방법이 변경된다.
        * 기본 동작은 폭넓게 적용되고, 예외 동작은 더 높은 우선 순위를 가짐
        * 이를 메소드 오버라이딩(overriding)이라 칭한다.
        *
        * 위 코드 실행시
        * SC에서 정의한 sum메소드로 출력됨을 확인할 수 있다.
        * */

        /*
        * 오버라이딩을 사용할 때는
        * 메소드의 형태를 정의하는 메소드의 서명(signature)를 통일해야한다.
        * sysout으로 표현하여 출력하는 것과 return 값을 반환하는 것은 서로 시그니쳐가 다르다.
        *
        * 오버라이딩을 사용하고 시그니처가 부모와 자식이 다르면 에러가 발생한다.
        *
        * 만약 상위 하위의 시그니쳐가 같고, 안에 존재하는 내용이 똑같다면,
        * (=로직이 같다면) 중복이 발생하므로 이를 해결하기 위해선
        *
        * 하위 클래스에서 return super.상위메서드();를 사용하면
        * 중복 로직을 방지하며 같은 구문을 실행할 수 있다.
        * */

    }
}
