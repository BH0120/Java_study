package method;
/*
* !!! main이란?
* 자바와 개발자의 약속
* 자바를 이용해서 만들고 싶다면,
* 무조건 public static void main을 사용하여 실행해야함.
*
* ? 만약 메소드가 없다면 ?
* 같은 반복문을 여러 번 해야 되는데,
* 그 반복을 메소드를 호출함으로써 한 줄로 표현가능한 것을
* 계속 반복해서 새로 써야함
* */
//public class MethodDemo {
//    //메소드는 함수와 같은 의미이다.
//    //메소드(함수)의 정의
//    public static void numbering() {
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//    }
//    public static void main(String[] args) {
//        //함수의 호출
//        numbering();
//    }
//}


/*매개변수를 사용한 메소드 사용*/
//public class MethodDemo {
//    public static void numbering(int init, int limit){
//        int i = init;
//        while ( i < limit){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("--------------------------------");
//    }
//
//    public static void main(String[] args) {
//        numbering(3,5);
//
//        //매개변수를 사용하면 입력에 따른 출력이 다른 프로그램을 만들 수 있음
//        numbering(1, 6);
//    }
//}


/* 메서드 내에서 외부로 값을 반환 */
//public class MethodDemo {
//
//    //return값을 가지기 때문에 public static String
//    public static String numbering(int init, int limit){
//        int i = init;
//        String output = "";
//
//        while (i < limit){
//            output += i;
//            i++;
//        }
//        //메서드 내에서 외부로 값을 반환하기 위해선 반드시 return을 사용.
//        return output;
//    }
//    public static void main(String[] args) {
//        String result = numbering(1, 5);
//        System.out.println(result);
//    }
//}

/* 메서드 내에서 다수의 값을 외부로 반환 */
//public class MethodDemo {
//
//    //배열을 이용하여 복수의 값을 반환
//    public static String[] getMembers(){
//        String[] members = {"고병현", "김정민", "정건", "정민기"};
//        return members;
//    }
//
//    public static void main(String[] args) {
//        //getMembers()의 반환값을 받기 위해 동일한 자료형인 String[]을 사용
//        String[] members = getMembers();
//
//        //for each를 사용해 member의 이름 출력
//        for(String member : members) {
//            System.out.println(member);
//        }
//    }
//}


/* 메서드를 활용하여 txt파일에 반환값 적어보기 */
import java.io.*;

public class MethodDemo {
    public static String numbering(int init, int limit) {
        int i = init;
        String output = "";
        while (i < limit) {
            output += i + " ";
            i++;
        }

        return output;
    }


    public static void main(String[] args) {
        String result = numbering(10, 15);
        System.out.println(result);

        try{
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(result);
            out.close();
        } catch ( IOException e ) {

        }
    }
}