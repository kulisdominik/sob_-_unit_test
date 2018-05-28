package sokn;

import org.junit.Test;
import sokn.onp.ONP;
import sokn.onp.StackEmptyException;

import static org.junit.Assert.*;

public class ONPTest {

    @Test
    public void testONPCalculator() throws StackEmptyException {
        final String firstFunction = "(4+2)*(3-1)=";

        String result = ONP.getParseValue(firstFunction);
        assertNotNull(result);
        assertEquals("4 2 + 3 1 - * =", result);

        final String secondFunction = "2*(5+2)=";
        result = ONP.getParseValue(secondFunction);
        assertNotNull(result);
        assertEquals("2 5 2 + * =", result);

        final String thirdFunction = "4/(3-1)^(2*3)=";
        result = ONP.getParseValue(thirdFunction);
        assertNotNull(result);
        assertEquals("4 3 1 - ^ 2 3 * / =", result);
    }
}
