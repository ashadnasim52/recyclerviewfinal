package com.root.ashad.appmaker.er;

public class Itemclass {
    private  String extra;
    private String title;
    private  String complain;
    private  String name;
    private String email;

    public String getcomplain() {
        return complain;
    }

    public void setcomplain(String complain) {
        this.complain = complain;
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

    public Itemclass() {
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public void setTitle(String complaintitle) {
        this.title = complaintitle;
    }

    public String getextra() {
        return extra;
    }

    public String getTitle() {
        return title;
    }
}
