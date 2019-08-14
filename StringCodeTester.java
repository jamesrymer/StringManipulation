import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
/*
  EmailsTest -- unit tests for the Emails class.
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