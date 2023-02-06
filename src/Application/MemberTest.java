package Application;

import java.util.List;

public class MemberTest {
    public static void main(String[] args) {
        Member member = new Member(); //참조형은 메모리에 올려야 하기 때문에 new 라는 키워드로 생성

        MemberService memberService = new MemberService();

        //회원가입
        memberService.register(member);

        //회원탈퇴
        memberService.withdraw(member);

        //회원목록
        List<Member> memberList = memberService.getList();
    }
}
