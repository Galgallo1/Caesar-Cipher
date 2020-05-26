public class Decode {
    private static  int key;
    private static String sentence;


    public Decode (int key, String sentence){
        Decode.key = key;
        Decode.sentence = sentence;
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

    public String decrypt() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            int ch = sentence.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch -= key % 26;
                if (ch < 'A') ch += 26;
            } else if (Character.isLowerCase(ch)) {
                ch -= key % 26;
                if (ch < 'a') ch += 26;
            }
            sb.append((char) ch);
        }
        return sb.toString();

    }

}
