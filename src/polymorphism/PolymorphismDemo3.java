package polymorphism;

interface I2{
    public String A();
}
interface I3{
    public String B();
}
class D implements I2,I3{
    public String A() {
        return "A";
    }
    public String B() {
        return "B";
    }
}
public class PolymorphismDemo3 {
    public static void main(String[] args) {
        D obj = new D();
        I2 obj2 = new D();
        I3 obj3 = new D();

        obj.A();
        System.out.println(obj.A());
        obj.B();
        System.out.println(obj.B());

        obj2.A();
//        obj2.B();

//        obj3.A();
        obj3.B();
    }
}
/*
* 스마트폰을 우리는 모든 기능을 사용하지만,
* 우리가 어린이에게 이건 게임기야 라고 말하면
* 어린이는 게임기라고 인식하고 게임기의 기능만을 사용함
* */

