import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class test {

    @Test
    public void testConvertirEnRomains() {
        assertEquals("I", roman.convertirEnRomains(1));
        assertEquals("IV", roman.convertirEnRomains(4));
        assertEquals("IX", roman.convertirEnRomains(9));
        assertEquals("X", roman.convertirEnRomains(10));
        assertEquals("XLII", roman.convertirEnRomains(42));
        assertEquals("XC", roman.convertirEnRomains(90));
        assertEquals("C", roman.convertirEnRomains(100));
        assertEquals("CD", roman.convertirEnRomains(400));
        assertEquals("D", roman.convertirEnRomains(500));
        assertEquals("CM", roman.convertirEnRomains(900));
        assertEquals("M", roman.convertirEnRomains(1000));
        assertEquals("MMMCMXCIX", roman.convertirEnRomains(3999));
        assertEquals("", roman.convertirEnRomains(0));
        assertEquals("", roman.convertirEnRomains(-5));
    }
}
