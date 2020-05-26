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
    public void setKey_getCorrectKey_int() {
        Encoding.setKey(20);
        assertEquals(20, Encoding.getKey());
    }

    @Test
    public void setSentence_getCorrectSentence_String() {
        Encoding.setSentence("Hello");
        assertEquals("Hello", Encoding.getSentence());
    }

    @Test
    public void encrypt_encodeStringProvide_String(){
        Encoding encode = new Encoding(23, "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        String expectedOutput = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        assertEquals(expectedOutput,encode.encrypt());
    }
}