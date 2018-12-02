package com.flysnow.common;

public enum StatusEnum {

    INIT(0, "初始"), VALID(1, "有效"), INVALID(-1, "失效");

    private int status;
    private String statusName;

    private StatusEnum(int status, String statusName) {
        this.status = status;
        this.statusName = statusName;
    }

    public int getStatus() {
        return status;
    }

    public String getStatusName() {
        return statusName;
    }

    public static StatusEnum statusName(int status) {
        for (StatusEnum state : values()) {
            if (state.getStatus() == status) {
                return state;
            }
        }
        return null;
    }

}
