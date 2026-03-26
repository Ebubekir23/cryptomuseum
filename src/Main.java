import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Kullanıcıdan input almak için
        CaesarCipher caesar = new CaesarCipher();  // Az önce yazdığımız sınıf

        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║       CRYPTOMUSEUM v1.0          ║");
        System.out.println("║   Classical Cipher Laboratory    ║");
        System.out.println("╚══════════════════════════════════╝");

        boolean running = true; // Döngüyü kontrol eden değişken

        while (running) {

            // Menüyü göster
            System.out.println("\n┌─────────────────────────────┐");
            System.out.println("│  Select an algorithm:       │");
            System.out.println("│  [1] Caesar Cipher          │");
            System.out.println("│  [2] Vigenere Cipher        │");
            System.out.println("│  [3] Rail Fence Cipher      │");
            System.out.println("│  [4] Exit                   │");
            System.out.println("└─────────────────────────────┘");
            System.out.print("> ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Enter'ı temizle

            if (choice == 1) {

                // Şifrele mi çöz mü?
                System.out.println("[1] Encrypt  [2] Decrypt");
                System.out.print("> ");
                int mode = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter text: ");
                String text = scanner.nextLine();

                System.out.print("Enter shift (1-25): ");
                int shift = scanner.nextInt();
                scanner.nextLine();

                String result;
                if (mode == 1) {
                    result = caesar.encrypt(text, shift);
                    System.out.println("\n[ENCRYPTED]: " + result);
                } else {
                    result = caesar.decrypt(text, shift);
                    System.out.println("\n[DECRYPTED]: " + result);
                }

                // Tarihsel not
                System.out.println("\n── HISTORICAL NOTE ──────────────────");
                System.out.println("Julius Caesar used this cipher to");
                System.out.println("communicate with his generals (58 BC).");
                System.out.println("WHY IT FAILED: Only 25 possible keys.");
                System.out.println("Broken by frequency analysis in 9th century.");
                System.out.println("─────────────────────────────────────");

            } else if (choice == 2) {

    VigenereCipher vigenere = new VigenereCipher();

    System.out.println("[1] Encrypt  [2] Decrypt");
    System.out.print("> ");
    int mode = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter text: ");
    String text = scanner.nextLine();

    System.out.print("Enter key (a word, example: KEY): ");
    String key = scanner.nextLine();

    String result;
    if (mode == 1) {
        result = vigenere.encrypt(text, key);
        System.out.println("\n[ENCRYPTED]: " + result);
    } else {
        result = vigenere.decrypt(text, key);
        System.out.println("\n[DECRYPTED]: " + result);
    }

    System.out.println("\n── HISTORICAL NOTE ──────────────────");
    System.out.println("Invented in 1553 by Giovan Bellaso.");
    System.out.println("Called 'le chiffre indéchiffrable' —");
    System.out.println("the unbreakable cipher — for 300 years.");
    System.out.println("WHY IT FAILED: Charles Babbage cracked it");
    System.out.println("in 1854 using repeating key patterns.");
    System.out.println("─────────────────────────────────────");

            } else if (choice == 3) {

    RailFenceCipher railFence = new RailFenceCipher();

    System.out.println("[1] Encrypt  [2] Decrypt");
    System.out.print("> ");
    int mode = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter text: ");
    String text = scanner.nextLine();

    System.out.print("Enter number of rails (2-5): ");
    int rails = scanner.nextInt();
    scanner.nextLine();

    String result;
    if (mode == 1) {
        result = railFence.encrypt(text, rails);
        System.out.println("\n[ENCRYPTED]: " + result);
    } else {
        result = railFence.decrypt(text, rails);
        System.out.println("\n[DECRYPTED]: " + result);
    }

    System.out.println("\n── HISTORICAL NOTE ──────────────────");
    System.out.println("Used in the American Civil War (1860s)");
    System.out.println("and WWI military communications.");
    System.out.println("WHY IT FAILED: Very few rail options.");
    System.out.println("Pattern is easy to guess by brute force.");
    System.out.println("─────────────────────────────────────");

            } else if (choice == 4) {
                System.out.println("Goodbye!");
                running = false; // Döngüyü durdur
            }
        }

        scanner.close();
    }
}