import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {


    @Test
    public void tst1(){
        assertEquals(  "0/5", Main.printerError("abcde")   );
    }


}
