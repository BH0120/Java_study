package condition;

public class ConditionDemo {
    public static void main(String[] args) {
        System.out.println("switch(1)");
        switch(1){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
        }

        System.out.println("switch(2)");
        switch(2){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
        }

        System.out.println("switch(3)");
        switch(3){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
        }

        System.out.println("-----------------------------------------------");
        System.out.println("if~else if 문으로 바꿔보기");
        int val = 1;
        if(val == 1){
            System.out.println("one");
        } else if(val == 2){
            System.out.println("two");
        } else if(val == 2){
            System.out.println("three");
        }

    }
}
