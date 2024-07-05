
import java.util.Scanner;
public class Translator {
    private static final char[] ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] CIPHER = "DEFGHIJKLMNOPQRSTUVWXYZABC".toCharArray();
    private static final char MOST_COMMON_CHAR = 'E';

    public String encryptMessage (String regLine){
        regLine= regLine.toUpperCase(); // Convert all characters to uppercase

        char[] line = regLine.toCharArray();

        for (int i = 0; i < line.length; i++) {
            if (line[i] != ' ') { // Encrypt only non-space characters
                line[i] = CIPHER[getIndexCipher(line[i])];
            }
        }
        return new String(line);
    }
    public String decryptMessage(String cipher){
        cipher = cipher.toUpperCase();

        char[] line = cipher.toCharArray();

        for (int i = 0; i < line.length; i++) {
            if (line[i] != ' ') { // Encrypt only non-space characters
                line[i] = ALPHABET[getIndexReg(line[i])];
            }
        }
        return new String(line);
    }
    public int getIndexCipher(char letter){
        for(int i = 0; i<ALPHABET.length;i++){
            if(letter == ALPHABET[i]) return i;
        }
        return 0;
    }
    public int getIndexReg(char letter){
        for(int i = 0; i<CIPHER.length;i++){
            if(letter == CIPHER[i]) return i;
        }
        return 0;
    }
}