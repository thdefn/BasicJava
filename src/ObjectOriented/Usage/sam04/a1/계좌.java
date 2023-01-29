package ObjectOriented.Usage.sam04.a1;

import java.util.Date; //참조형 클래스는 String이 아니면 전부 import 해야한다

public class 계좌 {
    public String 이름;
    protected Date 개설일; //동일 패키지면 상속 관계없이 접근 가능
    int 계좌번호;
    private long 금액;
}
