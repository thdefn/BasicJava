package ObjectOriented.Usage.sam04.a1;

import java.util.Calendar;
/*
같은 패키지이고, 상속이 아닌 경우
* */
public class 저축계좌테스트 {
    public static void main(String[] args) {
        계좌 계좌1 = new 계좌();
        계좌1.이름 = "은행계좌";
        계좌1.개설일 = Calendar.getInstance().getTime();
        계좌1.계좌번호 = 12345;
        //계좌1.금액 = 1000; error private은 접근 불가
    }
}
