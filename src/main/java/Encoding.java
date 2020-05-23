public class Encoding {

    private static  int key;
    private static String sentence;


    public Encoding (int key, String sentence){
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
        Encoding.key = key;
    }

    public static void setSentence(String sentence){
        Encoding.sentence = sentence;
    }

}
