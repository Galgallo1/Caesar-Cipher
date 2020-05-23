public class Decode {
    private static  int key;
    private static String sentence;


    public Decode (int key, String sentence){
        this.key = key;
        this.sentence = sentence;
    }

    public static int getKey(){
        return key;
    }

    public static String getSentence(){
        return sentence;
    }

    public static void setKey(int key){
        Decode.key = key;
    }

    public static void setSentence(String sentence){
        Decode.sentence = sentence;
    }

}
