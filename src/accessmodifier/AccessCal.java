package accessmodifier;

class Calculator{
    //변수가 외부에서 사용될 이유가 없기에 private사용
    private int left, right;

    public void setOperands(int left, int right){
        this.left = left;
        this.right = right;
    }
    private int _sum(){
        return left + right;
    }

    public void sumDecoPlus() {
        System.out.println("++++"+_sum()+"++++");
    }

    public void sumDecoMinus() {
        System.out.println("----"+_sum()+"----");
    }
}

public class AccessCal {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setOperands(10,20);
        cal.sumDecoPlus();
        cal.sumDecoMinus();
    }
}
