public class Encoding<cypher> {

    private  static int key;
    private  static String sentence ;


    public Encoding (int key, String sentence){
        Encoding.key = key;
        Encoding.sentence = sentence;
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


     public String encrypt (){
        if(key<26){
            key = (key%26);
        }else if (key<0){
            key=(key%26)+26;
        }
        StringBuilder cypher = new StringBuilder();
        int length = sentence.length();
        for(int i = 0; i < length; i++ ){
            char ch = sentence.charAt(i);
            if (Character.isLetter(ch)){
                if (Character.isUpperCase(ch)){
                    char c = (char) (ch + key);
                    if (c > 'Z'){
                        cypher.append((char) (ch - (26 - key)));
                    }else{
                        cypher.append(c);
                    }
                }else if(Character.isLowerCase(ch)){
                    char c = (char) (ch + key);
                    if (c > 'z'){
                        cypher.append((char) (ch - (26 - key)));
                    }else{
                        cypher.append(c);
                    }
                }
            }else {
                cypher.append(ch);
            }

         }

         return cypher.toString();

     }
}
