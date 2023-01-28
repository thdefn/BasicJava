package ObjectOriented.Concept;
/*
생성자 오버로딩
-메서드 명은 동일하나 전달되는 파라미터만 다른 것 > 함수를 전달 파라미터만 달리하는 것 : 메서드 오버로딩
-필요한 여러 생성자 구현
-하나의 클래스에서 인자가 다르면 생성자를 여러 개 구현 가능

this
-구현된 자기 자신의 다른 생성자를 호출하는 문장
-생성자 구현에서 첫 줄에는 this(파라미터)로 다른 생성자를 호출하여 사용 가능
-두번째 줄 부터는 사용 불가

+인자=파라미터=매개변수
* */
public class 대학생 {
    public String 이름;
    public int 나이;
    public String 성별;
    public String 학과;

    //사용자 생성자 추가하면 기본 생성자도 추가하는 게 룰
    public 대학생(){}

    public 대학생(String 이름){
        this.이름 = 이름;
    }

    public 대학생(int 나이){
        this.나이 = 나이;
    }

    public 대학생(String 이름, int 나이){
        this(이름);
        this.나이 = 나이;
        //this(나이); this 생성자는 두 번 사용할 수 없다
    }
    public 대학생(String 이름, int 나이, String 성별){
        //this.이름 = 이름;
        this(이름,나이);
        this.성별 = 성별;
    }

    public 대학생(String 이름, int 나이, String 성별, String 학과){
        //this.이름 = 이름;
        this(이름,나이,성별);
        this.학과 = 학과;
    }

    //생성자 오버로딩 Duplicated Method : JAVA 입장에서 데이터 타입의 시그니처가 같으면 같다고 본다
    public 대학생(String 이름, String 성별){
        //this.이름 = 이름;
        this(이름);
        this.성별 = 성별;
    }

    /*
    public 대학생(String 이름, String 학과){
        this.이름 = 이름;
        this.학과 = 학과;
    }
    */
}
