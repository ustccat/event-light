package net.michael_j.ddd.api.enums;

/**
 * @author: fuxi
 * @date: 2018/10/25
 */
public enum ErrorMsgEnum {

    /**
     * 业务错误
     */
    ILLEGAL_STATUS_CHANGE(-1000, "违法的状态变更"),

    /**
     * 系统错误
     */
    DB_QUERY_EXCEPTION(-2000, "数据库查询异常"),
    DB_INSERT_EXCEPTION(-2010, "记录入库异常"),
    DB_INSERT_EXCEPTION_RECOVER(-2011, "恢复记录入库异常"),
    DB_UPDATE_EXCEPTION(-2012, "更新记录入库失败"),
    SYSTEM_EXCEPTION(-2100, "系统异常，请稍后重试"),
    CALL_TUYA_ERROR(-2200, "调用处罚中心异常"),

    /**
     * 权限错误
     */
    PLEASE_LOGIN(-3000, "请登录"),
    NO_PRIVILEGE_SHOP(-3001, "没有店铺查看权限"),

    /**
     * 未知错误
     */
    SUBMIT_FAIL_SOME_SHOPS(-4000, "部分商户提交失败"),
    RECOVER_FAIL_SOME_SHOPS(-4001, "部分商户恢复失败"),

    /**
     * 逻辑异常
     */
    BAD_VIOLATION_LOGIC(-5000, "逻辑异常,提交违规项后分数增长"),
    BAD_PUNISH_LOGIC(-5100, "当前已存在同级别处罚"),

    /**
     * 系统维护中
     */
    SYSTEM_MAINTAINING(-6000, "系统维护中");

    private final int code;
    private final String msg;

    ErrorMsgEnum(int code, String desc) {
        this.code = code;
        this.msg =desc;
    }

    public static ErrorMsgEnum getByCode(int code){
        ErrorMsgEnum[] arr$ = values();
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            ErrorMsgEnum platform = arr$[i$];
            if(platform.code == code) {
                return platform;
            }
        }

        return null;
    }

    public int code() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}


