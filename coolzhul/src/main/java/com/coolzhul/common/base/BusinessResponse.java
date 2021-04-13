package com.coolzhul.common.base;

import com.coolzhul.common.enumdic.base.BusinessResponseStatus;

public class BusinessResponse <T>{
    private final BusinessResponseStatus status;
    private final String message;
    private T object;

    public BusinessResponse(BusinessResponseStatus status,
                            String message,
                            T t){
        this.status = status;
        this.message = message;
        this.object = t;
    }
    public BusinessResponse(BusinessResponseStatus status,
                            String message){
        this.status = status;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public BusinessResponseStatus getStatus() {
        return status;
    }

    public T getObject() {
        return object;
    }
}
