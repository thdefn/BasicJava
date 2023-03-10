package ObjectOriented.Usage.sam02;

import ObjectOriented.Usage.sam02.엄마;

/*
자식의 유전적 특징은 엄마 뿐만 아니라 아빠로부터도 물려받는다
클래스 상속은 단일 상속을 기본으로 한다

-다중상속
     :BUT 자바에는 다중 상속의 개념이 없다, 인터페이스로 구현
-단일상속

자바의 특징 = 단순함
-포인터를 사용하지 않는다
-다중상속을 받지 않는다

* */
public class 자식 implements 아빠, 엄마
{

    @Override
    public void 형광등달기() {

    }

    @Override
    public void 세차하기() {

    }

    @Override
    public void 집안일하기() {

    }
}
