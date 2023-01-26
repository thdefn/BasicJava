package ObjectOriented;

public class CreditCard {
    private long cardNumber; //실제 프로젝트에서 클래스 내부 필드는 대부분 private
    public String cardOwner;
    public long balance;
    public long point;

    public void use(long amount){
        balance += amount;
    }
    public void payBill(long amount){
        balance -= amount;
        addPoint(amount/1000);
    }
    private void addPoint(long point){
        //point = point + point; 변수명이 같기때문에 헷갈림
        //this 키워드 : 내 멤버야
        this.point += point;
    }

    //setter : private 필드에 값을 설정하는 방법
    public void setCarNumber(long cardNumber){
        //값을 검증하는 용도로도 setter를 사용할 수 있다
        if(cardNumber < 1000_0000_0000_0000L){
            System.err.println("There is Wrong Value of the Card Number");
        }else{
            this.cardNumber=cardNumber;
        }
    }

    //getter : 필드의 값을 가져오기
    public long getCardNumber(){
        //화면에 카드 번호를 보여주고 싶지 않을 때
        return 0;
        //return cardNumber;
    }

}

