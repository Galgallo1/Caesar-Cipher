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

    }


    @Test
    public void testGetKey() {
    }

    @Test
    public void testGetSentence() {
    }

    @Test
    public void setKey() {
    }

    @Test
    public void setSentence() {
    }
}