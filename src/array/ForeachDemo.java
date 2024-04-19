package array;

public class ForeachDemo {
    public static void main(String[] args) {

        String[] members = {"고병현", "김정민", "정민기", "정건"};

        //members에 있는 것들을 순서대로 e라는 String 변수에 넣음
        for (String e : members){
            System.out.println(e);
        }


        /*
        * String 배열은 유동적이지 못해 매우 불편함
        *
        * 이를 해결하기 위해 Collection이 생김
        * */
    }
}
