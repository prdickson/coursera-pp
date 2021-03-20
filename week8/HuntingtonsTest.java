import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HuntingtonsTest {
    @Test
    public void testRemovesWhiteSpace() {
        assertEquals("abc", Huntingtons.removeWhitespace("a \n\n\t\t  b\tc"));
    }

    @Test
    public void testDiagnoseNotHumanlow() {
        assertEquals("not human", Huntingtons.diagnose(0));
        assertEquals("not human", Huntingtons.diagnose(9));
    }

    @Test
    public void testDiagnoseNormal() {
        assertEquals("normal", Huntingtons.diagnose(10));
        assertEquals("normal", Huntingtons.diagnose(35));
    }

    @Test
    public void testDiagnoseHighRisk() {
        assertEquals("high risk", Huntingtons.diagnose(36));
        assertEquals("high risk", Huntingtons.diagnose(39));
    }

    @Test
    public void testDiagnoseHuntingtons() {
        assertEquals("Huntington’s", Huntingtons.diagnose(40));
        assertEquals("Huntington’s", Huntingtons.diagnose(180));
    }

    @Test
    public void testDiagnoseNotHumanHigh() {
        assertEquals("not human", Huntingtons.diagnose(181));
    }

    @Test
    public void testMaxRepeatsConsecutive() {
        assertEquals(1, Huntingtons.maxRepeats("CAG"));
        assertEquals(2, Huntingtons.maxRepeats("CAGCAG"));
        assertEquals(2, Huntingtons.maxRepeats("CAGCAGC"));
        assertEquals(4, Huntingtons.maxRepeats("TTCAGCAGCAGCAGTTTTTTTTT"));
    }

    @Test
    public void testMaxRepeatsNonConsecutive() {
        String fiveRepeats = "TTCAGCAGCAGCAGTTTCAGCAGCAGCAGCAGTTTTTTTTTTTTTCAGTTTTTTT";

        assertEquals(5, Huntingtons.maxRepeats(fiveRepeats));
    }
}