import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AssertTest {
    @Test
    public void testAssertEquals(){
        String result = "wartosc";
        String r2 = result;
        assertEquals("wartosc inna", "wartosc", result);
        assertEquals("wartosc inna", result,r2);
        assertEquals("wartosc inna", result,"wartosc");
        assertEquals("wartosc inna", "wartosc",result);
        assertNotSame("wartosc inna", "wartosć",result);


    }
    @Test
    public void testAssertSame(){
        Long v1 = Long.valueOf(123456);
        Long v2 = v1;
        assertEquals("inny obiekt",v1,v2);
        assertNotSame("inny obiekt",v1,Long.valueOf(123456));
    }

    @Test
    public void testAssertTrueFalse(){
        assertTrue("Niepoprawnie", 4<5);
        assertFalse("Niepoprawnie", 4<3);
    }
    @Test
    public void testAssertNull(){
        Long v1 = null;
        Long v2 = new Long(123);
        assertNull(v1);
        assertNotNull(v2);
    }
    @Test
    public void testAssertTab(){
        int[] int1 = {1,2,3,4};
        int[] int2 = {1,2,3,4};
        assertArrayEquals(int1,int2);

    }
}
