package accessmodifier.inner;

/*
* public 클래스가 포함되는 소스코드는 public 클래스의
* 클래스 명과 소스코드의 파일명이 같아야한다.
* 즉 소스코드 하나당 하나의 public클래스만 존재할 수 있다.
* */


public class ClassAccessModifierInnerPackage {
    PublicClass publicClass = new PublicClass();
    DefaultClass defaultClass = new DefaultClass();

}
