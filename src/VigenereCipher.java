public class VigenereCipher {

    public String encrypt(String text, String key) {

        String result = "";
        key = key.toUpperCase(); // Anahtarı büyük harfe çevir
        int keyIndex = 0;        // Anahtarın hangi harfindeyiz

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                int shift = key.charAt(keyIndex % key.length()) - 'A';
                result += (char) ((ch - 'A' + shift) % 26 + 'A');
                keyIndex++; // Sadece harf işlenince anahtarı ilerlet

            } else if (ch >= 'a' && ch <= 'z') {
                int shift = key.charAt(keyIndex % key.length()) - 'A';
                result += (char) ((ch - 'a' + shift) % 26 + 'a');
                keyIndex++;

            } else {
                result += ch; // Harf değilse olduğu gibi bırak
            }
        }

        return result;
    }

    public String decrypt(String text, String key) {

        String result = "";
        key = key.toUpperCase();
        int keyIndex = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                int shift = key.charAt(keyIndex % key.length()) - 'A';
                result += (char) ((ch - 'A' - shift + 26) % 26 + 'A');
                keyIndex++;

            } else if (ch >= 'a' && ch <= 'z') {
                int shift = key.charAt(keyIndex % key.length()) - 'A';
                result += (char) ((ch - 'a' - shift + 26) % 26 + 'a');
                keyIndex++;

            } else {
                result += ch;
            }
        }

        return result;
    }
}