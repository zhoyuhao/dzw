package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Customercar {
	@TableId(value = "carid",type = IdType.AUTO)
    private Integer carid;

    private String cidk;

    private String carlicenceplate;

    private String carbrand;

    private String carcolor;

    private String carconfigure;

    private String carlocality;

    private String carmodel;

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getCidk() {
        return cidk;
    }

    public void setCidk(String cidk) {
        this.cidk = cidk == null ? null : cidk.trim();
    }

    public String getCarlicenceplate() {
        return carlicenceplate;
    }

    public void setCarlicenceplate(String carlicenceplate) {
        this.carlicenceplate = carlicenceplate == null ? null : carlicenceplate.trim();
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand == null ? null : carbrand.trim();
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor == null ? null : carcolor.trim();
    }

    public String getCarconfigure() {
        return carconfigure;
    }

    public void setCarconfigure(String carconfigure) {
        this.carconfigure = carconfigure == null ? null : carconfigure.trim();
    }

    public String getCarlocality() {
        return carlocality;
    }

    public void setCarlocality(String carlocality) {
        this.carlocality = carlocality == null ? null : carlocality.trim();
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel == null ? null : carmodel.trim();
    }
}