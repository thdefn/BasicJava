package ObjectOriented.Usage.sam01;
/*
final 클래스는 더 이상 상속이 이뤄지지 않는다
내가 라이브러리 클래스를 만들었는데, 다른 사람이 내 걸 변경하기 원하지 않음 > final
*
* */
public /*final*/ class 교직원 extends 사람 {
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

    //오버라이딩 조건 1.함수이름 2.리턴타입 3.매개변수
    @Override //어노테이션을 굳이 붙이지 않아도 되나 어노테이션 붙인 후 오버라이딩 조건과 달라지면 error
    public void 정보출력() {
        System.out.println("------사람정보-------");
        System.out.println("이름: "+이름);
        System.out.println("주민번호: "+super.번호);
        System.out.println("학교명: "+학교명);
        System.out.println("교직원번호: "+번호);
    }

    //메서드를 따로 만들 수 있으나 부모 객체와 동일한 정보출력 메서드라는 의미를 가지고 가기 위해 오버라이딩
    public final void 교직원정보출력(){ //final 붙이면 동일한 이름의 메서드에 대해 오버라이딩 할 수 없음
        System.out.println("------사람정보-------");
        System.out.println("이름: "+이름);
        System.out.println("주민번호: "+super.번호);
        System.out.println("학교명: "+학교명);
        System.out.println("교직원번랴: "+번호);
    }
}
