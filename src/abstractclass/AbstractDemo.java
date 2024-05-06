package abstractclass;

/*
* 추상화의 사용 이유
* 추상클래스는 상속을 강제하기 위해 사용됨.
*
* 부모에서는 메서드의 시그니처만 정의를 해두고, 그 메소드의 실제 동작 방법이
* 메소드를 상속 받은 하위 클래스에서 해결할 수 있도록 한다.
*
* 이것이 필요한 이유는 공동적인 부분을 구현하고, 상황에 따라질 수 있는 부분을
* 메소드를 사용하는 사용자가 결정하거나,
* 사용자의 상황에 따라 다른 결과를 만들어야할 때 사용된다.
* */

/*
* ++ abstract는 특정 메소드에 대해서 수많은 경우의 수를
*  전부 대비하여 개발할수 없으므로 추상적인 클래스와
* 그 안에 추상+일반 메소드를 선언하고 해당 클래스를
* 상속(extends)받아 상속받은 클래스에서 오버라이딩(overriding) 하여
*  사용하도록 하는 방법.
* */


//추상화 메서드가 존재한다면, 무조건 추상화 클래스로 구현.
abstract class A {
    public abstract int b();

    //비어있지 않은 메서드는 추상메서드가 될 수 없음.
//    public abstract int c(){System.out.println("Hello");};

    // 추상 클래스 내에선 추상 메서드가 아닌 메서드가 존재할 수 있음.
    public void d() {
        System.out.println("World");
    }
}
class B extends A {
    public int b() {
        return 1;
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.b());
        //B는 A를 상속해서 A의 d()를 사용할 수 있음.
        obj.d();
    }
}
