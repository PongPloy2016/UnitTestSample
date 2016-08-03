package com.akexorcist.unittestsample;

import android.util.Log;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void runWrapBlank() {
        String message = "Hello World";
        String result = StringUtils.wrapBlank(message);
        Assert.assertEquals("Hello World", result);

        Log.e("result",result);

        message = null;
        result = StringUtils.wrapBlank(message);
        Assert.assertEquals("", result);

        message = "null";
        result = StringUtils.wrapBlank(message);
        Assert.assertEquals("", result);

        message = "That's null";
        result = StringUtils.wrapBlank(message);
        Assert.assertEquals("That's null", result);

        message = "Null";
        result = StringUtils.wrapBlank(message);
        Assert.assertEquals("", result);
    }

    @Test
    public void runConcat() {
        String message1 = "Hello";
        String message2 = "World";
        String result = StringUtils.concat(message1, message2);
        Assert.assertEquals("HelloWorld", result);

        message1 = null;
        message2 = "Awesome";
        result = StringUtils.concat(message1, message2);
        Assert.assertEquals("nullAwesome", result);

        message1 = null;
        message2 = null;
        result = StringUtils.concat(message1, message2);
        Assert.assertEquals("nullnull", result);
    }

}












































