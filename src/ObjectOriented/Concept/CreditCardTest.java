package ObjectOriented.Concept;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard myCard = new CreditCard(); //생성자 생성

        CreditCard myOtherCard;
        myOtherCard = new CreditCard();

        //myCard.cardNumber = 1234_5678_1234_1234L; //.을 통해 접근한다
        myCard.setCarNumber(1234_5678_1234_1234L);
        myCard.setCarNumber(234_5678_1234_1234L);
        myCard.cardOwner = "홍길동";

        // 언더바는 자릿수를 구분하기위해 넣는거지 시스템에 반영되지 않음
        System.out.println(myCard.getCardNumber());
        System.out.println(myCard.cardOwner); //지정안할시 null
        System.out.println(myCard.balance);
        System.out.println(myCard.point);

        myCard.use(8000);
        myCard.use(12000);
        myCard.use(21000);
        myCard.payBill(30000);

        System.out.println("--------------");
        System.out.println(myCard.getCardNumber());
        System.out.println(myCard.cardOwner);
        System.out.println(myCard.balance);
        System.out.println(myCard.point);
    }
}
