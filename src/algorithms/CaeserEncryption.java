package algorithms;

public class CaeserEncryption {

    static StringBuilder ENC(String str, int key) {
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
                if (encryptedIndex < 0) encryptedIndex += 26; // ✅ التصحيح المهم
                encrypted.append(chars.charAt(encryptedIndex));
            }
        }
        return encrypted;
    }

    public static void main(String[] args) {
        System.out.println("Encrypted: " + ENC("ibrahim", 3));
    }
}
