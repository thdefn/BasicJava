package ObjectOriented.Usage.sam01;

public class 교직원 extends 사람 {
    public String 학교명;
    public long 번호; //사원번호, 학교의 교직원 번호

    public 교직원(){

    }
    public 교직원(String 이름, long 번호, String 학교, long 교원번호){
        super(이름, 번호);
        this.학교명 = 학교;
        this.번호 = 교원번호;
    }

    public long get교직원번호(){
        return 번호;
    }

}
