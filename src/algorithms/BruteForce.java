package algorithms;

public class BruteForce {

    // Performs a brute-force Caesar cipher decryption attempt on the given text
    public static void bruteForce(String encrypted) {
        final int MAX_KEY = 25; // Caesar cipher has only 26 possible shifts (0–25)

        System.out.println("Starting brute-force decryption...");
        System.out.println("Encrypted text: " + encrypted);
        System.out.println("--------------------------------------");

        // Try all possible key shifts
        for (int key = 1; key <= MAX_KEY; key++) {
            String decrypted = String.valueOf(CaeserEncryption.ENC(encrypted, -key));
            System.out.printf("Key %2d → %s%n", key, decrypted);
        }

        System.out.println("--------------------------------------");
        System.out.println("Brute-force completed.");
    }

    public static void main(String[] args) {
        bruteForce("leudklp");
    }
}
