package polymorphism;

interface father{}
interface mother{}
interface programmer{
    public void coding();
}
interface believer{}
class Steve implements father,programmer,believer{
    public void coding(){
        System.out.println("fast");
    }
}
class Rachel implements mother,programmer{
    public void coding(){
        System.out.println("elegnace");
    }
}
public class Workspace {
    public static void main(String[] args) {
        programmer employee1 = new Steve();
        programmer employee2 = new Rachel();

        employee1.coding();
        employee2.coding();
    }
}
/*
*
* workspace에서는 프로그래머의 능력만이 필요하고,
* Rachel과 Steve가 programmer일 때(데이터형이 programmer일 때) 인터페이스 programmer의 멤버만 쓰게 되는데
* coding 메소드를 서로 다르게 구현했다보니
* 같은 클래스로 인스턴스화해도 서로 다르게 동작
*
* */
