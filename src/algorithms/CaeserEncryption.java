package algorithms;

public class CaeserEncryption {

    static StringBuilder ENC(String str, int key) {
        if (key <= 0) return new StringBuilder(str);

        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder encrypted = new StringBuilder();

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = chars.indexOf(c);

            if (index == -1) {
                encrypted.append(c);
            } else {
                int encryptedIndex = (index + key) % 26;
                encrypted.append(chars.charAt(encryptedIndex));
            }
        }

        return encrypted;
    }

    public static void main(String[] args) {
        System.out.println("Encrypted: " + ENC("ibrahim", 3));
    }
}
