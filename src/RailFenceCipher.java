public class RailFenceCipher {

    public String encrypt(String text, int rails) {

        // Her satır için ayrı bir StringBuilder oluştur
        StringBuilder[] rows = new StringBuilder[rails];
        for (int i = 0; i < rails; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRail = 0;  // Hangi satırdayız
        boolean goingDown = true; // Aşağı mı yoksa yukarı mı gidiyoruz

        for (int i = 0; i < text.length(); i++) {
            rows[currentRail].append(text.charAt(i)); // Harfi o satıra ekle

            // Sınıra gelince yön değiştir
            if (currentRail == rails - 1) {
                goingDown = false;
            } else if (currentRail == 0) {
                goingDown = true;
            }

            if (goingDown) {
                currentRail++;
            } else {
                currentRail--;
            }
        }

        // Tüm satırları birleştir
        String result = "";
        for (StringBuilder row : rows) {
            result += row.toString();
        }

        return result;
    }

    public String decrypt(String text, int rails) {

        int len = text.length();
        int[] pattern = new int[len]; // Her harf hangi satırda?

        int currentRail = 0;
        boolean goingDown = true;

        // Önce pattern'i bul
        for (int i = 0; i < len; i++) {
            pattern[i] = currentRail;

            if (currentRail == rails - 1) goingDown = false;
            else if (currentRail == 0) goingDown = true;

            if (goingDown) currentRail++;
            else currentRail--;
        }

        // Her satırda kaç harf var hesapla ve yerleştir
        char[] result = new char[len];
        int index = 0;

        for (int rail = 0; rail < rails; rail++) {
            for (int i = 0; i < len; i++) {
                if (pattern[i] == rail) {
                    result[i] = text.charAt(index++);
                }
            }
        }

        return new String(result);
    }
}