package polymorphism;
/*
class A{
    public String x(){
        return "x";
    }
}
class B extends A{
    public String y(){
        return "y";
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        A obj = new B();
        //정상실행
        obj.x();

        //에러 발생
        //obj.y();
        // 클래스 B를 A처럼 사용했기 때문에 실행X
    }
}
*/

class A{
    public String x(){
        return "A.x";
    }
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        A obj = new B();
        //아래는 B에 존재하는 x메서드를 가져옴.
        System.out.println(obj.x());


        /*
        * 위와 같이 되는 이유.
        *
        * ① 클래스 B의 데이터 타입을 클래스 A로 인스턴스화하면 클래스 B의 메소드 y는 존재하지
        * 않는 것처럼 실행되지 않음 => 클래스 B가 클래스 A화 됨.
        *
        * ② 클래스 B의 데이터 타입을 클래스 A로 지정하여 인스턴스화 했을 때,
        * 클래스 B의 메소드 x를 실행하면 클래스 A에서 정의된 메서드가 아니라
        * 클래스 B에서 정의된 메서드가 실행됨. => 클래스 B의 기본적인 성질은 가짐.
        * */
    }
}