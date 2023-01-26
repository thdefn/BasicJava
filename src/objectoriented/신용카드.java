package objectoriented;

public class 신용카드 {
    public long 카드번호;
    public String 카드소유주;
    public long 카드사용누적금액; // 클래스에 대한 속성값은 초깃값이 0임
    public long 누적포인트;

    public void 카드사용(long 카드사용금액) {
        카드사용누적금액 += 카드사용금액;
    }

    public void 카드비용지급(long 지급금액) {
        카드사용누적금액 -= 지급금액;
        포인트지급(지급금액 / 1000); //지급금액 만원당 십원 적립
    }

    private void 포인트지급(long 포인트금액){
        누적포인트 += 포인트금액;
    }

    //카드사용
    //카드비용지급
    //포인트적립 (카드 비용 지급 이후 포인트가 적립됨)

}
