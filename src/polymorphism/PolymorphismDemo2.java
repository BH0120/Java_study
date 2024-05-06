package polymorphism;

//PolymophismDemo의 A,B클래스
//class A{
//    public String x(){return "A.x";}
//}
//class B extends A{
//    public String x(){return "B.x";}
//    public String y(){return "y";}
//}
class B2 extends A{
    public String x(){return "B2.x";}
}
public class PolymorphismDemo2 {
    public static void main(String[] args) {

        //서로 다른 클래스가 데이터 타입 A로 인스턴스화
        A obj = new B();
        A obj2 = new B2();
        System.out.println(obj.x());
        System.out.println(obj2.x());
    }
}