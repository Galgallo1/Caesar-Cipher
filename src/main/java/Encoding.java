public class Encoding {

    private static int key;

    private String sentence;

    public Encoding (int key, String sentence){
        this.key = key;
        this.sentence = sentence;
    }

    public static int getKey(){
        return key;
    }

    public String getSentence(){
        return sentence;
    }

    public void setKey(int key){
        this.key = key;
    }

    public void setSentence(String sentence){
        this.sentence= sentence;
    }

}
