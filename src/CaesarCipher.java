public class CaesarCipher {

    // Bu metod metni şifreler
    // text = şifrelenecek metin, shift = kaç adım kaydıracağız
    public String encrypt(String text, int shift) {

        String result = ""; // Sonucu burada biriktireceğiz

        // Metindeki her harfi tek tek işle
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i); // O anki harfi al

            // Büyük harf mi? (A=65, Z=90)
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) ((ch - 'A' + shift) % 26 + 'A');

            // Küçük harf mi? (a=97, z=122)
            } else if (ch >= 'a' && ch <= 'z') {
                result += (char) ((ch - 'a' + shift) % 26 + 'a');

            // Harf değilse (boşluk, nokta vs.) olduğu gibi bırak
            } else {
                result += ch;
            }
        }

        return result; // Şifreli metni döndür
    }
    // Bu metod şifreli metni çözer
    public String decrypt(String text, int shift) {

        // Geri kaydırmak = 26-shift kadar ileri kaydırmak
        // Örnek: 3 geri = 23 ileri (ikisi aynı sonucu verir)
        return encrypt(text, 26 - shift);
    }
}
