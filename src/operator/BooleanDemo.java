package operator;

public class BooleanDemo {
    public static void main(String[] args) {
        System.out.println(1==2);
        System.out.println(1==1);
        System.out.println("one"=="two");
        System.out.println("one"=="one");


        /*
         * false
         * true
         * false
         * true
         * */

        System.out.println(1!=2);
        System.out.println(1!=1);
        System.out.println("one"!="two");
        System.out.println("one"!="one");

        /*
        * true
        * false
        * true
        * false
        * */

        System.out.println(10>20);      //false
        System.out.println(10>2);       //true
        System.out.println(10>10);      //false

        System.out.println(10 >= 20);   // false
        System.out.println(10 >= 2);    // true
        System.out.println(10 >= 10);   // true

        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);     //false
        System.out.println(a.equals(b));//true

        //String간의 값의 비교는 equals를 활용한다.

    }
}
