package ObjectOriented.Usage.sam01;

public class 사무직원 extends 교직원{
    public String 부서;

    public 사무직원(String 이름, long 번호, String 학교명, long 교직원번호, String 부서){
        //사무직원은 교직원만 생성해주면 됨, 사람을 상속받는 것은 사무직원 입장에서 관심사가 아님
        super(이름, 번호, 학교명, 교직원번호);
        this.부서 = 부서;
    }
}
