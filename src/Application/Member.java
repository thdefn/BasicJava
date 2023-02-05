package Application;

//데이터 관점에서 회원에 대한 데이터를 저장하는 클래스
public class Member {
    private String userId; //private 한정자로 외부에서 접근 block
    private String name;
    private String email;
    private String hp1;
    private String hp2;
    private String hp3;
    private boolean useSmsYn;

    //접근을 위한 getter setter
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHp1() {
        return hp1;
    }

    public void setHp1(String hp1) {
        this.hp1 = hp1;
    }

    public String getHp2() {
        return hp2;
    }

    public void setHp2(String hp2) {
        this.hp2 = hp2;
    }

    public String getHp3() {
        return hp3;
    }

    public void setHp3(String hp3) {
        this.hp3 = hp3;
    }

    public boolean isUseSmsYn() {
        return useSmsYn;
    }

    public void setUseSmsYn(boolean useSmsYn) {
        this.useSmsYn = useSmsYn;
    }
}
