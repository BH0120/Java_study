package interfaces.exam3;

/*
* 클래스는 여러 개의 인터페이스를 구현할 수 있다.
* 단, 두 개의 인터페이스에 존재하는 메서드를
* 모두 구현해야만 한다.
* */

interface I1 {
    public void x();
}

interface I2 {
    public void z();
}

class A implements I1, I2 {
    public void x() {};
    public void z() {};
}
