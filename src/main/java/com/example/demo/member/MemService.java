package com.example.demo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemService {
    @Autowired // 의존성 자동 주입, MemDao 객체를 자동 생성함
    private MemDao dao;

    public void addMember() {
        dao.insert();
        System.out.println("Service addMember");
    }

    public void getMember() {
        dao.select();
        System.out.println("Service getMember");
    }

    public void getAllMember() {
        dao.selectAll();
        System.out.println("Service getAllMember");
    }

    public void editMember() {
        dao.update();
        System.out.println("Service editMember");
    }

    public void delMember() {
        dao.delete();
        System.out.println("Service delMember");
    }

}
