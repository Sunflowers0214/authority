package com.flysnow.common;

import java.util.UUID;

public class UUIDUtil {

    public static String genKey() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
