package com.example.email.models;

public class Email {
    private String name;
    private String email;
    public Boolean send ;

    public Email() {
    }

    public Email(String name, String email, Boolean send) {
        this.name = name;
        this.email = email;
        this.send = send;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getSend() {
        return send;
    }

    public Email sendEmail() {
        this.send = true;
        return this;
    }

}
