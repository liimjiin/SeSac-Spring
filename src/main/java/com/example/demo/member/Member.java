package com.example.demo.member;

// MemberVO
public class Member {
    private String id;
    private String pwd;
    private String name;
    private String email;

    public Member() {
    }

    public Member(String id, String pwd, String name, String email) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member{" +
            "id='" + id + '\'' +
            ", pwd='" + pwd + '\'' +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            '}';
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
