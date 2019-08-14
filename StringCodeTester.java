import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
/*
  StringCodeTester -- unit tests for the StringCode class.
 */
public class StringCodeTester {
    @Test
    public void testBlowup() {
        assertTrue("attttxzzz".equals(StringCode.blowUp("a3tx2z")));
    }

    @Test
    public void testMaxRun() {
        assertEquals(3, StringCode.maxRun("xxyyyz"));
    }
}