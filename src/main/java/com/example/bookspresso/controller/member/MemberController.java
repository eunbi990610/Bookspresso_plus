package com.example.bookspresso.controller.member;

import com.example.bookspresso.controller.admin.PosterController;
import com.example.bookspresso.dto.member.MemberJoinDTO;
import com.example.bookspresso.service.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/join")
    public String join(){
        return "member/member/join";
    }

    @PostMapping("/join")
    public String join(MemberJoinDTO memberJoinDTO){



        memberService.addMember(memberJoinDTO);
        // 소개글 기본값 안녕하세요

        return null;
    }

    @GetMapping("/login")
    public String login(){
        return "member/member/login";
    }

    @GetMapping("/findId")
    public String findId(){
        return "member/member/findId";
    }

    @GetMapping("/findPassword")
    public String findPassword(){
        return "member/member/findPassword";
    }

//  이미지, 소개글_ 기본값을 form으로 받아서 dto에 넣일때 get으로 dto에 같이 넣는 방식으로 작업


}
