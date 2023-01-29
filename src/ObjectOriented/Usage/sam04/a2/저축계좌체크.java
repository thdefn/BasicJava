package ObjectOriented.Usage.sam04.a2;


import ObjectOriented.Usage.sam04.a1.계좌;

import java.util.Calendar;

public class 저축계좌체크 extends 계좌 { //패키지가 다른 계좌를 상속받고 싶음
    public void 값체크(){
        이름 = "저축계좌";
        개설일 = Calendar.getInstance().getTime();
        //계좌번호 = 1234; default는 동일 패키지가 아니어서 불가
    }
}
