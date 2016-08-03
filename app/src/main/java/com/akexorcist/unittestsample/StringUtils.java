package com.akexorcist.unittestsample;

/**
 * Created by Akexorcist on 9/9/15 AD.
 */
public class StringUtils {

    public static String wrapBlank(String message) {
        return (message == null && !message.equalsIgnoreCase("null")) ? message.trim() : "";
    }

    public static String concat (String message1, String message2) {
        return message1 + message2;
    }

}

