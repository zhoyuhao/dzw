package com.accp.pojo;

import java.util.Date;

public class Customer {
    private String cidk;

    private String cnamek;

    private String caddressk;

    private String csexk;

    private String cphonek;

    private String cidnumberk;

    private String ctypek;

    private String ckahaok;

    private Integer cdoublerk;

    private Float cmoneyk;

    private Integer cgrade;
    
    private Date time;
    
    

    public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getCidk() {
        return cidk;
    }

    public void setCidk(String cidk) {
        this.cidk = cidk == null ? null : cidk.trim();
    }

    public String getCnamek() {
        return cnamek;
    }

    public void setCnamek(String cnamek) {
        this.cnamek = cnamek == null ? null : cnamek.trim();
    }

    public String getCaddressk() {
        return caddressk;
    }

    public void setCaddressk(String caddressk) {
        this.caddressk = caddressk == null ? null : caddressk.trim();
    }

    public String getCsexk() {
        return csexk;
    }

    public void setCsexk(String csexk) {
        this.csexk = csexk == null ? null : csexk.trim();
    }

    public String getCphonek() {
        return cphonek;
    }

    public void setCphonek(String cphonek) {
        this.cphonek = cphonek == null ? null : cphonek.trim();
    }

    public String getCidnumberk() {
        return cidnumberk;
    }

    public void setCidnumberk(String cidnumberk) {
        this.cidnumberk = cidnumberk == null ? null : cidnumberk.trim();
    }

    public String getCtypek() {
        return ctypek;
    }

    public void setCtypek(String ctypek) {
        this.ctypek = ctypek == null ? null : ctypek.trim();
    }

    public String getCkahaok() {
        return ckahaok;
    }

    public void setCkahaok(String ckahaok) {
        this.ckahaok = ckahaok == null ? null : ckahaok.trim();
    }

    public Integer getCdoublerk() {
        return cdoublerk;
    }

    public void setCdoublerk(Integer cdoublerk) {
        this.cdoublerk = cdoublerk;
    }

    public Float getCmoneyk() {
        return cmoneyk;
    }

    public void setCmoneyk(Float cmoneyk) {
        this.cmoneyk = cmoneyk;
    }

    public Integer getCgrade() {
        return cgrade;
    }

    public void setCgrade(Integer cgrade) {
        this.cgrade = cgrade;
    }
}