import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {

    @Test
    public void getKey() {
        Encoding test = new Encoding(1, "Hi");
        int expectedInt = 2;
        assertEquals(expectedInt, Encoding.getKey());

    }

    @Test
    public void getSentence() {
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