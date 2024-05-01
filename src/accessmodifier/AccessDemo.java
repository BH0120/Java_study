package accessmodifier;

class A {
    public String y() {
        return "public void y()";
    }

    private String z() {
        return "public void z()";
    }

    public String x(){
        return z();
    }
}


public class AccessDemo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        //아래는 오류발생
        //z는 private로 같은 클래스의 소속에서만 접근이 가능
        //System.out.println(a.z());

        //z에 접근하는 x는 정상 출력이 가능한데
        //이는 x는 같은 클래스 내부에 존재하여 z에 접근이 가능하다.
        System.out.println(a.x());
    }
}
