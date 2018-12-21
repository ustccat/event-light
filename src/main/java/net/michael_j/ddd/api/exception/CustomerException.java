package net.michael_j.ddd.api.exception;

import net.michael_j.ddd.api.enums.ErrorMsgEnum;

/**
 * @author: fuxi
 * @date: 2018/11/27
 */
public class CustomerException extends Exception {
    private ErrorMsgEnum errorMsgEnum;

    public CustomerException(ErrorMsgEnum errorMsgEnum) {
        super();
        this.errorMsgEnum = errorMsgEnum;
    }

    public ErrorMsgEnum getErrorMsgEnum() {
        return errorMsgEnum;
    }

    public void setErrorMsgEnum(ErrorMsgEnum errorMsgEnum) {
        this.errorMsgEnum = errorMsgEnum;
    }
}
