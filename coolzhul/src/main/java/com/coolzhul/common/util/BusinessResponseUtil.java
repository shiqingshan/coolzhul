package com.coolzhul.common.util;

import com.coolzhul.common.base.BusinessResponse;
import com.coolzhul.common.enumdic.base.BusinessResponseStatus;

public class BusinessResponseUtil{
    /**
     *  返回成功
     * @param message
     * @param t
     * @param <T>
     * @return
     */
    public static <T> BusinessResponse<T> success( String message,T t){
        return new BusinessResponse<T>(BusinessResponseStatus.SUCCESS,message,t);
    }
    public static <T> BusinessResponse<T> success( String message){
        return new BusinessResponse<T>(BusinessResponseStatus.SUCCESS,message);
    }
    public static <T> BusinessResponse<T> fail( String message,T t){
        return new BusinessResponse<T>(BusinessResponseStatus.SUCCESS,message,t);
    }
    public static <T> BusinessResponse<T> fail( String message){
        return new BusinessResponse<T>(BusinessResponseStatus.SUCCESS,message);
    }
}
