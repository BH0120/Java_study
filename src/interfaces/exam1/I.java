package interfaces.exam1;

/*
* 어떤 객체가 인터페이스를 사용하게 된다면,
* 그 객체는 무조건 인터페이스의 메소드를 구현해야함.
* 인터페이스에서 사용하는 메서드를 구현하지 않으면,
* 컴파일조차 거부당한다.
*
* */

interface I {
    public void z();
}

class A implements I {
    //인터페이스 I를 사용하기에 z를 반드시 구현.
    public void z() {}
}
