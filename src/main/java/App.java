import java.util.Scanner;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter et to encrypt a string, dt to decrypt and exit to close the App ");
        try {
            String userInput = input.nextLine();
            if (userInput.equals("et")) {
                Scanner encrypt = new Scanner(System.in);
                System.out.println("Enter a text to be encrypted");
                String encryptText = encrypt.nextLine();
                System.out.println("Enter an encryption value ranging from 1-25 ");
                Scanner key = new Scanner(System.in);
                int keyValue = Integer.parseInt(key.next());
                Encoding encoding = new Encoding(keyValue, encryptText);
                System.out.println(encoding);
            }else if (userInput.equals("dt")) {
                Scanner decrypt = new Scanner(System.in);
                System.out.println("Enter a text to be decrypted");
                String decryptText = decrypt.nextLine();
                System.out.println("Enter an decryption value ranging from 1-25 ");
                Scanner key1 = new Scanner(System.in);
                int keyValue1 = Integer.parseInt(key1.next());
                Decode decoding = new Decode(keyValue1, decryptText);
                System.out.println(decoding);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }

    }
}
