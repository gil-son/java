package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DemoUtilsTest {



    @Test
    void testEqualsAndNotEquals(){

        // SETUP
        DemoUtils demoUtils = new DemoUtils();

        int expected = 6;

        // EXECUTE
        int actual = demoUtils.add(2,4);


        // ASSERT
        Assertions.assertEquals(expected, actual, " 2+4 must be 6");
    }








}
