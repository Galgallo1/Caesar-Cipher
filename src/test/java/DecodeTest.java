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
    public void setKey_getCorrectKey_int() {
        Decode.setKey(20);
        assertEquals(20, Decode.getKey());
    }

    @Test
    public void setSentence_getCorrectSentence_String() {
        Decode.setSentence("Hello");
        assertEquals("Hello", Decode.getSentence());
    }

    @Test
    public void test_decrypt_decryptString_string(){
        Decode decode = new Decode(23,"QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD");
        String expectedOuput = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals(expectedOuput,decode.decrypt());
    }
}