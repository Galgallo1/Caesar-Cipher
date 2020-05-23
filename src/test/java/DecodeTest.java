import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTest {

    @Test
    public void getKey() {
        Decode test = new Decode(1, "Hi");
        int expectedInt = 1;
        assertEquals(expectedInt, Decode.getKey());
    }

    @Test
    public void getSentence_getCorrectSentence_String() {
        Decode test = new Decode(1, "Hello");
        String expectedOutput = "Hello";
        assertEquals(expectedOutput,Decode.getSentence());
    }


    @Test
    public void setKey() {
        Encoding.setKey(20);
        assertEquals(20, Encoding.getKey());
    }

    @Test
    public void setSentence() {
        Encoding.setSentence("Hello");
        assertEquals("Hello", Encoding.getSentence());
    }
}