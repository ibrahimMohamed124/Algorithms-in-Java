package algorithms;

import static algorithms.CaeserEncryption.ENC;

public class CaeserDecryption {

    static StringBuilder DEC(String str, int key){
        return ENC(str, -key);
    }

    public static void main(String[] args) {
        System.out.println("Decrypted: " + DEC("leudklp", 3));
    }
}
