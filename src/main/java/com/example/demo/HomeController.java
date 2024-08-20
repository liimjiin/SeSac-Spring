package com.example.demo;

// stereotype : 클래스 종류, 자동으로 객체를 생성해줌

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Controller
 *  - Controller 역할을 하는 class에 반드시 @Controller 어노테이션을 붙여줘야 함.
 *  - fullstack controller
 */
@Controller // 클라이언트의 요청을 받아 처리,
public class HomeController {
    // Service 객체 : 요청을 받아 처리하기 위해 필요, 비즈니스 로직을 담당
    // private Service service;

    @GetMapping("/") // Get 방식으로 전송된 것만 처리
    public String home() { // 요청을 처리하는 메서드는 뷰 페이지 경로를 반환
        return "index"; //
    }

    // join form
    @GetMapping("/member/join")
    public String joinForm() {
        return "joinForm";
    }

    // after join
    @PostMapping("/member/join")
    public String join() {
        // public String join(Member m) { // parameter를 받아와 처리해야 하는 경우
        // service.addMember(m); // 받아온 parameter, 즉 요청을 처리
        return "join";
    }

    // login form
    @GetMapping("/member/login") // Get 방식으로 전송된 것만 처리
    public String loginForm() { // 요청을 처리하는 메서드는 뷰 페이지 경로를 반환
        return "loginForm";
    }

    // after login
    @PostMapping("/member/login")
    public String login() { // 요청을 처리하는 메서드는 뷰 페이지 경로를 반환
        return "login";
    }
}
