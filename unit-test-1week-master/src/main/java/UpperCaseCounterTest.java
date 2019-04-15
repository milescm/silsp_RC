import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseCounterTest {

    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    String str = null;

    @Test
    public void null_check(){
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);

    }

}


