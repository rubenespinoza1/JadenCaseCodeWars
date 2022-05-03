package six_kyu.tenminwalk;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TenMinWalkTest {


    @Test
    public void Test() {
        assertTrue(TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertFalse(TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        assertFalse(TenMinWalk.isValid(new char[] {'w'}));
        assertFalse(TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }


}