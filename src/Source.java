import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Source {
    public static void main(String[] args) {
        /*
        String filename = "ciphertext.txt";
        String cipherText = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {    //for file reading
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            cipherText = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Regular message: " + cipherText);
        System.out.println(" ");
        Translator translator = new Translator();
        String decryptedMessage = translator.encryptMessage(cipherText);
        System.out.println("Decrypted Message: " + decryptedMessage);
        */

        Translator translate = new Translator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================================");
        System.out.println("Do you want to encrypt a message or decrypt a message?");
        System.out.println("Type 'Encrypt' or 'Decrypt'");
        System.out.println("======================================================");

        String line = scanner.nextLine();

        while(!line.equals("Encrypt") && !line.equals("Decrypt")){
            System.out.println("Sorry, I didn't get that. Please retype 'Encrypt' or 'Decrypt' as shown");
            line = scanner.nextLine();
        }
        String answer = "";
        if(line.equals("Encrypt")){
            System.out.println("Type a line for encryption:");
            String guess = scanner.nextLine();
            answer = translate.encryptMessage(guess);
        }
        else if (line.equals("Decrypt")){
            System.out.println("Type a line for encryption:");
            String guess = scanner.nextLine();
            answer = translate.decryptMessage(guess);
        }

        System.out.println(answer);
    }
}

