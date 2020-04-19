package com.accp.vo.yld;

import java.util.List;

import com.accp.pojo.Customercar;

public class customerVo {
    
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
    
    private List<Customercar> prsCar;

    public String getCidk() {
        return cidk;
    }

    public void setCidk(String cidk) {
        this.cidk = cidk;
    }

    public String getCnamek() {
        return cnamek;
    }

    public void setCnamek(String cnamek) {
        this.cnamek = cnamek;
    }

    public String getCaddressk() {
        return caddressk;
    }

    public void setCaddressk(String caddressk) {
        this.caddressk = caddressk;
    }

    public String getCsexk() {
        return csexk;
    }

    public void setCsexk(String csexk) {
        this.csexk = csexk;
    }

    public String getCphonek() {
        return cphonek;
    }

    public void setCphonek(String cphonek) {
        this.cphonek = cphonek;
    }

    public String getCidnumberk() {
        return cidnumberk;
    }

    public void setCidnumberk(String cidnumberk) {
        this.cidnumberk = cidnumberk;
    }

    public String getCtypek() {
        return ctypek;
    }

    public void setCtypek(String ctypek) {
        this.ctypek = ctypek;
    }

    public String getCkahaok() {
        return ckahaok;
    }

    public void setCkahaok(String ckahaok) {
        this.ckahaok = ckahaok;
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

    public List<Customercar> getPrsCar() {
        return prsCar;
    }

    public void setPrsCar(List<Customercar> prsCar) {
        this.prsCar = prsCar;
    }
    
}
