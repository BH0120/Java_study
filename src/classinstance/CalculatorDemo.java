package classinstance;

/*
* 인스턴스 메소드는 클래스 멤버에 접근할 수 있다.
* 클래스 메소드는 인스턴스 멤버에 접근할 수 없다.
*/



class Calculator {
    static double PI = 3.14;
    // 클래스 변수인 base를 추가함
    static int base = 0;
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
//        System.out.println(this.left + this.right);

        // base를 추가
        System.out.println(this.left + this.right + base);
    }

    public void avg() {
//        System.out.println((this.left + this.right) / 2);
        System.out.println((this.left + this.right + base) / 2);
    }

}


//public class CalculatorDemo {
//    public static void main(String[] args) {
//        Calculator c1 = new Calculator();
//        System.out.println(c1.PI);
//
//        Calculator c2 = new Calculator();
//        System.out.println(c2.PI);
//
//        // 직접적으로 접근도 가능함.
//        System.out.println(Calculator.PI);
//
//        /* 모두 static 으로 불렀던 PI를 가져오기 때문에 같은 값*/
//    }
//}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOperands(10, 20);
        c1.sum(); //30

        Calculator c2 = new Calculator();
        c2.setOperands(20, 40);
        c2.sum(); // 60출력

        //클래스 변수인 base의 값을 변경 (기존 0)
        Calculator.base = 10;
        c1.sum(); // 40출력
        c2.sum(); // 70출력

        //c1.base를 사용해서 값의 변화 확인(base값은 현재 10)
        c1.base = 20;
        c1.sum(); //50출력
        c2.sum(); //80출력

        /*
        * c1.base를 사용해도 c2에서 사용하는 base의 값이 동일하게 변동됨
        * static으로 선언하고 그것을 수정했기 때문.
        * */
    }
}
