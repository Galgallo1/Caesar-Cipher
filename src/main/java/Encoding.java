public class Encoding {

    private int key;
    private String sentence;

    public Encoding (int key, String sentence){
        this.key = key;
        this.sentence = sentence;
    }

    public int getKey(){
        return this.key;
    }

    public String getSentence(){
        return this.sentence;
    }

    public void setKey(int key){
        this.key = key;
    }

    public void setSentence(String sentence){
        this.sentence= sentence;
    }

}
