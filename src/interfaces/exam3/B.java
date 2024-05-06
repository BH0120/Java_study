package interfaces.exam3;

interface I3{
    public void x();
}

// 인터페이스도 상속이 가능하다.
interface I4 extends I3{
    public void z();
}


class B implements I4{
    //인터페이스의 멤버는 반드시 public으로 정의!
    public void x(){}
    public void z(){}
}

/*
* 인터페이스와 추상 클래스는 서로 비슷한 듯
* 다른 기능으로, 인터페이스는 클래스가 아니라
* 인터페이스라는 고유한 형태를 가지는 것.
*
* 반면에, 추상 클래스는 일반적인 클래스이다.
*
* 인터페이스는 구체적인 로직, 상태를 가질 수 없으나,
* 추상 클래스는 구체적인 로직이나 상태를 가질 수 있다.

* */
