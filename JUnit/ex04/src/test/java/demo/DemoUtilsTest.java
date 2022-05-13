package demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class DemoUtilsTest {



    @Test
    void testEqualsAndNotEquals(){

        // SETUP
        DemoUtils demoUtils = new DemoUtils();

        int expected = 6;
        int unexpected = 8;

        // EXECUTE
        int actual = demoUtils.add(2,4);


        // ASSERT
        //assertEquals(expected, actual, " 2+4 must be 6");
        assertEquals(6, demoUtils.add(2,4), " 2+4 must be 6");

        //assertNotEquals(unexpected, actual, "2+4 must not be 8");
        assertNotEquals(8, demoUtils.add(1,9), "1+9 must not be 8");
    }

    @Test
    void testNullAndNotNull(){

        // SETUP
        DemoUtils demoUtils = new DemoUtils();

        // EXECUTE
         Object str1 = "word";
         Object str2 = null;

        // ASSERT
        assertNotNull(demoUtils.checkNull(str1), "Object should not be null");
        assertNull(demoUtils.checkNull(str2), "Object should be null");


    }





}
