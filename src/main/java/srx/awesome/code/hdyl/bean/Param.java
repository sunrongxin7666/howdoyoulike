package srx.awesome.code.hdyl.bean;

import java.util.Date;

public class Param {
    private String paramKey;

    private Date paramValue;

    private String paramDesc;

    public Param(String paramKey, Date paramValue, String paramDesc) {
        this.paramKey = paramKey;
        this.paramValue = paramValue;
        this.paramDesc = paramDesc;
    }

    public Param() {
        super();
    }

    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey == null ? null : paramKey.trim();
    }

    public Date getParamValue() {
        return paramValue;
    }

    public void setParamValue(Date paramValue) {
        this.paramValue = paramValue;
    }

    public String getParamDesc() {
        return paramDesc;
    }

    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc == null ? null : paramDesc.trim();
    }
}