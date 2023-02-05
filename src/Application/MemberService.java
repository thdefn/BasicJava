package Application;

import java.util.List;

//회원에 대한 기능을 구현한 클래스
public class MemberService {

    /**
     * 회원 가입
     * @param member 회원정보
     * @return 성공여부
     */
    public boolean register(Member member){

        return true; //회원가입이 잘 된 경우
    }

    /**
     * 회원 탈퇴
     * @param member 회원정보
     * @return 성공여부
     */
    public boolean withdraw(Member member){

        return true;
    }

    /**
     * 회원 목록
     * @return 회원정보목록
     */
    public List<Member> getList(){

        return null;
    }


}
