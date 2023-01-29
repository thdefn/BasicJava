package ObjectOriented.Usage.sam04.a2;

import ObjectOriented.Usage.sam04.a1.계좌;

import java.util.Calendar;

/*
같은 패키지가 아니고, 상속도 아닌 경우
* */
public class 저축계좌체크테스트 {
    public static void main(String[] args) {
        계좌 계좌1 = new 계좌();
        계좌1.이름 = "은행계좌";
        //계좌1.개설일 = Calendar.getInstance().getTime(); error 상속이 아니어서 protected 못받음
        //계좌1.계좌번호 = 12345;
        //계좌1.금액 = 1000;
    }
}
