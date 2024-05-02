package accessmodifier.outter;
import accessmodifier.inner.PublicClass;
import accessmodifier.outter.*;


/*                                    다른 패키지
 * 제어자\유형 | 같은 클래스 | 같은 패키지 | 서브 클래스 | 관계 없음
 * public    |     ○     |     ○     |     ○     |    ○
 * protected |     ○     |     ○     |     ○     |    X
 * default   |     ○     |     ○     |     X     |    X
 * private   |     ○     |     X     |     X     |    X
 * */



public class ClassAccessModifierOuterPackage {
    PublicClass publicClass = new PublicClass();
//    DefaultClass defaultClass = new DefaultClass();
    /* 디폴트는 접근 제어자가 default이기 때문에 불가능*/
}
