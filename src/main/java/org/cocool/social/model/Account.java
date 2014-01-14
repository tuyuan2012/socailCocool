package org.cocool.social.model;

public class Account {
    private Integer aid;

    private String alogin;

    private String aname;

    private String apass;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAlogin() {
        return alogin;
    }

    public void setAlogin(String alogin) {
        this.alogin = alogin == null ? null : alogin.trim();
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getApass() {
        return apass;
    }

    public void setApass(String apass) {
        this.apass = apass == null ? null : apass.trim();
    }
}