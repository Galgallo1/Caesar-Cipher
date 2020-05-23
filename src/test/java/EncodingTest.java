import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {

    @Test
    public void getKey_getCorrectKey_int() {
        Encoding test = new Encoding(1, "Hi");
        int expectedInt = 1;
        assertEquals(expectedInt, Encoding.getKey());

    }

    @Test
    public void getSentence_getCorrectSentence_String() {
        Encoding test = new Encoding(1, "Hello");
        String expectedOutput = "Hello";
        assertEquals(expectedOutput,Encoding.getSentence());
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