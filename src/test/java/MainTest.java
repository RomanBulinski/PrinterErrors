import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void test1(){
        assertEquals(  "0/5", Main.printerError("abcde")   );
    }

    @Test
    public void test2(){
        assertEquals(  "5/5", Main.printerError("xyxvr")   );
    }



}
