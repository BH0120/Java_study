package overloading;
/*
 * 자바에서는 인자의 타입이나 인자의 개수에 따라 부를 메서드가 달라질 수 있다.
 * 이를 overloading 이라고 함.
 * */

class Calculator{
    int left,right;
    int middle = 0;

    public void setOperands(int left, int right){
        System.out.println("setOperands(left, right)");
        this.left=left;
        this.right=right;
    }

    public void setOperands(int left, int right, String middle){
        System.out.println("setOperands(left, right)");
        this.left=left;
        this.right=right;
    }


    // ① 해당 메서드는 바로 위에 존재하는 setOperands(left,right)와 left,right 부분이 중복된다.
//    public void setOperands(int left,int middle,int right){
//        System.out.println("setOperands(left, middle, right)");
//        this.left=left;
//        this.middle=middle;
//        this.right=right;
//    }

    // ② 1번의 중복을 방지하기 위해 다음과 같이 수정한다.
    public void setOperands(int middle, int left, int right){
        System.out.println("setOperands(middle, left, right)");
        // 아래 코드를 통해 인자가 2개인 setOperands를 이용하여 left와 right에 값을 넣는다.
        // 이는 setOperands(left,right)메서드를 실행하기에 해당 메서드의 sysout문도 같이 출력된다.
        this.setOperands(left,right);
        this.middle=middle;
    }

    public void sumTest(int a, int b){
        System.out.println(a + b);
    }
    public void sumTest(float a, float b){
        System.out.println(a + b);
    }
    public void sumTest(double a, int b){
        System.out.println(a + b);
    }
    public void sumTest(String a, String b, String c){
        System.out.println(a + b + c);
    }


    public void sum() {
        System.out.println(this.left+this.middle+this.right);
    }

    public void avg(){
        System.out.println((this.left+this.middle+this.right)/2);
    }
}



public class OverloadingCal {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setOperands(1,2,3);
        cal.sum();
        cal.avg();

        cal.setOperands(1,2);
        cal.sum();
        cal.avg();
    }
}


/*
*  오버로딩 과 오버라이딩의 차이점.
*  Overloading : 같은 이름, 다른 메소드에서 여러 개의 같은 이름의 메소드를 다룰 수 있게 하는 것.
*  Overriding : 부모와 자식이 존재할 때, 부모에게 있는 메소드를 자식이 시그니쳐가 같은 메소드를 만들어 자신에게 맞게 바꾸는 것
*
* 자식이 부모가 만든 메소드에 "올라타"서 메소드의 동작 방법을 변경 >> 오버라이딩
* 같은 이름, 다른 매개 변수의 메소드를 여러개 만들 수 있다 >> 오버로딩
* */
