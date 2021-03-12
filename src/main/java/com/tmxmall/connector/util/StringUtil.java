package com.tmxmall.connector.util;

import java.util.UUID;

public class StringUtil {
    public static String getRandomId() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
