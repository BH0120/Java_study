package inheritance.construct;


/*
*  자바에서는 객체를 생성할 때 자동으로 생성자를 만들어주기 때문에
*  자기 자신을 인스턴스화 하더라도 에러가 생기지 않는다.
*  하지만 아래 예제는 다르다.
* */

//
//public class ConstructorDemo {
//    public ConstructorDemo(int param1) {}
//    public static void main(String[] args) {
//        ConstructorDemo obj = new ConstructorDemo();
//    }
//}

/*
* 위와 같이 매개 변수가 존재하는 생성자가 있을 때는
* 자동으로 기본 생성자를 만들지 않는다.
* 이는 위 코드에서 존재하지 않는 생성자를 호출하고 있는 것이다.
* 이를 해결하려면 기본생성자를 직접 추가해야 한다.
* */

public class ConstructorDemo {
    // 기본 생성자의 추가
    public ConstructorDemo() {}
    public ConstructorDemo(int param1){}
    public static void main(String[] args) {
        ConstructorDemo demo = new ConstructorDemo();
    }
}