import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTest {

    @Test
    public void getKey() {
        Decode test = new Decode(1, "Hi");
        int expectedInt = 1;
        assertEquals(expectedInt, Decode.getKey());
    }
}