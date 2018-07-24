package com.root.ashad.appmaker.er;

public class Itemclass {
    private  String extra;
    private String title;
    private  String Complain;
    private  String name;
    private String email;

    public String getComplain() {
        return Complain;
    }

    public void setComplain(String complain) {
        this.Complain = complain;
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

    public void setComplaintitle(String complaintitle) {
        this.title = complaintitle;
    }

    public String getextra() {
        return extra;
    }

    public String getcomplaintitle() {
        return title;
    }
}
