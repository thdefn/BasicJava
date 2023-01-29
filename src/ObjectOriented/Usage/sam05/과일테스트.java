package ObjectOriented.Usage.sam05;

public class 과일테스트 {
    //static(main)에서는 인스턴스 함수를 호출 못함으로 static 함수로 생성
    public static void 과일확인(과일 과일체크){
        if(과일체크 instanceof 바나나){
            System.out.println("바나나");
        } else if (과일체크 instanceof 배) {
            System.out.println("배");
        } else if (과일체크 instanceof 사과) {
            System.out.println("사과");
        }else {
            System.out.println("바나나, 배, 사과가 아닙니다");
        }
    }

    public static void main(String[] args) {
        과일 과일1 = new 과일();
        과일 과일2 = new 바나나(); //업캐스팅
        과일 과일3 = new 배();
        과일 과일4 = new 사과();

        if(과일1 instanceof 바나나){
            System.out.println("바나나");
        } else if (과일1 instanceof 배) {
            System.out.println("배");
        } else if (과일1 instanceof 사과) {
            System.out.println("사과");
        }else {
            System.out.println("바나나, 배, 사과가 아닙니다"); //과일1은 과일이어서 사과, 바나나, 배가 될 수 없다
        }

        System.out.println("-------------------");
        과일[] 과일리스트 = {과일1, 과일2, 과일3, 과일4};
        for(int i=0;i<과일리스트.length;i++){
            과일확인(과일리스트[i]);
        }

        생선 생선1 = new 생선();

        /*
        if(생선1 instanceof 과일){ error 생선과 과일은 상속관계가 없어서 컴파일 에러 발생
            System.out.println("과일");
        }else{
            System.out.println("과일 아님");
        }
         */
    }
}
