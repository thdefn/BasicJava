package ObjectOriented.Utility;

public class 사람 {
    private String 이름;
    private int 나이;

    public 사람(String 이름, int 나이){
        this.이름 = 이름;
        this.나이 = 나이;
    }

    //Object로부터 오버라이딩
    @Override
    public String toString() {
        return "이름: " + this.이름 + ", 나이: " + this.나이;
    }
}
