package com.accp.pojo;

public class Supplier {
    private Integer ghsid;

    private String ghsname;

    private String ghsaddress;

    private String ghsphone;

    private String ghsuser;

    private String ghsaccount;

    public Integer getGhsid() {
        return ghsid;
    }

    public void setGhsid(Integer ghsid) {
        this.ghsid = ghsid;
    }

    public String getGhsname() {
        return ghsname;
    }

    public void setGhsname(String ghsname) {
        this.ghsname = ghsname == null ? null : ghsname.trim();
    }

    public String getGhsaddress() {
        return ghsaddress;
    }

    public void setGhsaddress(String ghsaddress) {
        this.ghsaddress = ghsaddress == null ? null : ghsaddress.trim();
    }

    public String getGhsphone() {
        return ghsphone;
    }

    public void setGhsphone(String ghsphone) {
        this.ghsphone = ghsphone == null ? null : ghsphone.trim();
    }

    public String getGhsuser() {
        return ghsuser;
    }

    public void setGhsuser(String ghsuser) {
        this.ghsuser = ghsuser == null ? null : ghsuser.trim();
    }

    public String getGhsaccount() {
        return ghsaccount;
    }

    public void setGhsaccount(String ghsaccount) {
        this.ghsaccount = ghsaccount == null ? null : ghsaccount.trim();
    }
}