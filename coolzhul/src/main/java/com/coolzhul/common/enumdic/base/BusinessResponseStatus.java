package com.coolzhul.common.enumdic.base;

import com.coolzhul.common.enumdic.EnumMapping;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 */
public enum BusinessResponseStatus implements EnumMapping {
    SUCCESS("0","成功"),
    FAIL("-1","失败"),
    WARN("1","警告");
    private final String code;
    private final String text;
    BusinessResponseStatus (String code,String text){
        this.code = code;
        this.text = text;
    }

    @Override
    @JsonValue
    public String getCode() {
        return this.code;
    }

    @Override
    public String getText() {
        return this.text;
    }
    public static BusinessResponseStatus valueOfCode (String code){
        for(BusinessResponseStatus businessResponseStatus : BusinessResponseStatus.values()){
            if(businessResponseStatus.getCode().equals(code)){
                return businessResponseStatus;
            }
        }
        return null;
    }
}
