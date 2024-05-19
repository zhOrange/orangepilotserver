package com.orange.orangepilotserver.common.exception;

import com.orange.orangepilotserver.common.result.IResultCode;
import lombok.Getter;

/**
 * @author ykcz
 * @version 1.0
 * @description: TODO
 * @date 2024/5/18 20:31
 */
@Getter
public class BusinessException extends RuntimeException {

    public IResultCode resultCode;

    public BusinessException(IResultCode errorCode) {
        super(errorCode.getMsg());
        this.resultCode = errorCode;
    }

    public BusinessException(String message){
        super(message);
    }

    public BusinessException(String message, Throwable cause){
        super(message, cause);
    }

    public BusinessException(Throwable cause){
        super(cause);
    }


}
