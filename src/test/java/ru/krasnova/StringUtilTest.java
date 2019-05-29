package ru.krasnova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    //testIsEmpty_nullString_returnTrue

    @Test
    public void testJoinArray(){
        String[] array = new String[]{"my", "lovely", "work"};
        assertEquals("my lovely work", StringUtil.joinArray(array, ' '));
    }

    @Test
    public void testToArray(){
      //  String[] array = new String[]{"my", "lovely", "work"};
      //  array.equals( StringUtil.toArray("my lovely work", ' '));
        String[] expected = {"T", "E", "S", "T"};
        String source = "T:E:S:T";

        assertArrayEquals("Wrong array", expected, StringUtil.toArray(source, ':'));
        assertNull(StringUtil.toArray(null, ':'));
    }

    @Test
    public void testToDouble(){
        assertEquals(1.25, StringUtil.toDouble("1.25"), 0);
        assertEquals("Not Nan for null", Double.NaN, StringUtil.toDouble(null), 0);
    }

    @Test
    public void testFromDouble(){
        double source = 3.1415;
        String expected = "3.1415";
        String actual = StringUtil.fromDouble(source);
        assertEquals("Unexpected String value", expected, actual);
    }

    @Test
    public void testIsEmpty_nullString_returnTrue(){
        boolean result = StringUtil.isEmpty(null);
        Assertions.assertTrue(result);
        assertFalse(StringUtil.isEmpty("Test"));
    }

}
