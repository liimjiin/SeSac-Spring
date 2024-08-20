package com.example.demo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mem") // 컨트롤러의 공통 url, 등록하는 모든 url 앞에 '/mem'이 붙음
public class MemController {
    @Autowired
    private MemService service;

    @GetMapping("/join")
    public String joinForm() {
        return "mem/join";
    }

    @PostMapping("/join")
    public String join(Member m) {
        System.out.println(m);
        service.addMember();
        return "index";
    }

    // 검색
    // url : get, view : info.jsp
    @GetMapping("/get")
    public String get() {
        service.getMember();
        return "mem/info";
    }

    // 전체검색
    // url : getAll, view : getAll.jsp
    @GetMapping("/getAll")
    public String getAll() {
        service.getAllMember();
        return "mem/getAll";
    }

    // 수정
    // url : edit, view : edit.jsp
    @GetMapping("/edit")
    public String edit() {
        service.editMember();
        return "mem/edit";
    }

    // 삭제
    // url : del, view : del.jsp
    @GetMapping("/del")
    public String del() {
        service.delMember();
        return "mem/del";
    }
}
