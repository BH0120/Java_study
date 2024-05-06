package finals;
/*
* 추상화(abstract)는 상속을 강제하는 것이었지만,
* final은 상속/변경을 금지하는 규제
* */


class Calculator {
    static final double PI = 3.14;
    int left, right;

    public void serOperands(int left, int right) {
        this.left = left;
        this.right = right;

        //Calculator에서 PI를 final로 정의했기에 오류 발생
//        Calculator.PI = 6;
    }

    //이는 Class 자체에도 final로 정의가 가능하다.
    final class C {
        final void b() {
        }
    }

    //final은 상속이 불가.
//    class D extends C{}

}
public class FinalCalDemo {
}
