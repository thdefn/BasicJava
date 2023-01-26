package ObjectOriented;

public class CreditCard {
    public long cardNumber;
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
        /*point = point + point; 변수명이 같기때문에 헷갈림
        this 키워드 : 내 멤버야
         */
        this.point += point;
    }
}

