# 🔐 CryptoMuseum

> **[🌐 Live Site → ebubekir23.github.io/cryptomuseum](https://ebubekir23.github.io/cryptomuseum)**

---

## English

### What is CryptoMuseum?

CryptoMuseum is an interactive web application that lets you encrypt and decrypt messages using 7 classical cipher algorithms — each paired with its historical story, how it works, and why it was eventually broken.

Built as a first-year Software Engineering project to explore cryptography, history, and clean UI design.

---

### Algorithms

| Algorithm | Era | Type |
|-----------|-----|------|
| Caesar Cipher | 58 BC | Substitution |
| Vigenere Cipher | 1553 AD | Polyalphabetic |
| Rail Fence Cipher | 1860s | Transposition |
| Atbash Cipher | ~600 BC | Substitution |
| ROT13 | 1980s | Substitution |
| Morse Code | 1837 AD | Encoding |
| Columnar Transposition | WWI | Transposition |

---

### How to Use

**Step 1 — Choose an Algorithm**
Click any algorithm card at the top of the page. Each card shows the algorithm name, its historical era, and a brief description. The selected card gets highlighted.

**Step 2 — Select Mode**
Use the toggle in the Cipher Lab section:
- **Encrypt** — converts your plain text into ciphertext
- **Decrypt** — converts ciphertext back into plain text

**Step 3 — Enter Parameters (if required)**
Some algorithms need extra input:
- **Caesar** → enter a shift number between 1–25 (e.g. shift=3 means A→D)
- **Vigenere** → enter a keyword (e.g. KEY)
- **Rail Fence** → enter number of rails between 2–8
- **Columnar** → enter a keyword (e.g. ZEBRA)
- **Atbash, ROT13, Morse** → no parameters needed

**Step 4 — Run the Cipher**
Click the **▶ Run Cipher** button. The result appears instantly in the Output field on the right.

---

### Button Guide

| Button | What it does |
|--------|-------------|
| **▶ Run Cipher** | Encrypts or decrypts your input using the selected algorithm |
| **⎘ Copy** | Copies the output text to your clipboard |
| **⤷ Share Link** | Generates a URL containing your encrypted message — send it to a friend |
| **⇅ Swap** | Moves the output to the input field and switches the mode (useful for quick decryption) |
| **✕ Clear** | Clears both input and output fields |
| **🌐 TR / EN** | Switches the entire site between Turkish and English |
| **☀ Light / ☾ Dark** | Toggles between light and dark mode |

---

### Share Feature

When you click **Share Link**, the site generates a special URL that encodes your encrypted message. You can copy this link and send it to anyone — when they open it, the site automatically loads your ciphertext so they can decrypt it.

> All encryption runs entirely in your browser. No data is sent to any server.

---

### Tech Stack

- Pure HTML, CSS, JavaScript — zero dependencies, zero frameworks
- Hosted on GitHub Pages (free)
- Content Security Policy headers for XSS protection
- Input sanitization on all user-facing fields

---

### Run Locally

```bash
git clone https://github.com/ebubekir23/cryptomuseum.git
cd cryptomuseum
# Open index.html in your browser — no build step needed
```

---

*Made by [Ebubekir Yılmaz](https://github.com/ebubekir23) — Software Engineering, Year 1*

---
---

## Türkçe

### CryptoMuseum Nedir?

CryptoMuseum, 7 klasik şifreleme algoritması kullanarak mesajlarınızı şifrelemenizi ve çözmenizi sağlayan interaktif bir web uygulamasıdır. Her algoritma; kendi tarihsel hikâyesi, nasıl çalıştığı ve sonunda neden kırıldığıyla birlikte sunulmaktadır.

Kriptografi, tarih ve temiz arayüz tasarımını bir arada keşfetmek amacıyla Yazılım Mühendisliği 1. sınıf projesi olarak geliştirilmiştir.

---

### Algoritmalar

| Algoritma | Dönem | Tür |
|-----------|-------|-----|
| Caesar Şifresi | MÖ 58 | Yerine Koyma |
| Vigenere Şifresi | MS 1553 | Çok Alfabeli |
| Ray Çiti Şifresi | 1860'lar | Transpozisyon |
| Atbash Şifresi | yaklaşık MÖ 600 | Yerine Koyma |
| ROT13 | 1980'ler | Yerine Koyma |
| Mors Kodu | MS 1837 | Kodlama |
| Sütunsal Transpozisyon | I. Dünya Savaşı | Transpozisyon |

---

### Nasıl Kullanılır?

**Adım 1 — Algoritma Seç**
Sayfanın üstündeki algoritma kartlarından birine tıklayın. Her kart; algoritmanın adını, tarihsel dönemini ve kısa bir açıklamasını gösterir. Seçilen kart vurgulanır.

**Adım 2 — Mod Seç**
Şifre Laboratuvarı bölümündeki geçiş düğmesini kullanın:
- **Şifrele** — düz metni şifreli metne dönüştürür
- **Çöz** — şifreli metni orijinal haline döndürür

**Adım 3 — Parametre Gir (gerekiyorsa)**
Bazı algoritmalar ek bilgi gerektirir:
- **Caesar** → 1–25 arasında bir kaydırma sayısı girin (ör. shift=3 → A, D olur)
- **Vigenere** → bir anahtar kelime girin (ör. KEY)
- **Ray Çiti** → 2–8 arasında ray sayısı girin
- **Sütunsal** → bir anahtar kelime girin (ör. ZEBRA)
- **Atbash, ROT13, Mors** → parametre gerekmez

**Adım 4 — Şifreyi Çalıştır**
**▶ Şifrele** düğmesine tıklayın. Sonuç sağ taraftaki Çıkış alanında anında görünür.

---

### Düğme Rehberi

| Düğme | Ne Yapar? |
|-------|-----------|
| **▶ Şifrele** | Girişinizi seçilen algoritmaya göre şifreler veya çözer |
| **⎘ Kopyala** | Çıkış metnini panonuza kopyalar |
| **⤷ Link Paylaş** | Şifreli mesajınızı içeren bir URL oluşturur — arkadaşınıza gönderin |
| **⇅ Yer Değiştir** | Çıkışı giriş alanına taşır ve modu değiştirir (hızlı çözme için kullanışlı) |
| **✕ Temizle** | Hem giriş hem çıkış alanlarını temizler |
| **🌐 TR / EN** | Sitenin tamamını Türkçe ve İngilizce arasında değiştirir |
| **☀ Açık / ☾ Koyu** | Açık ve koyu mod arasında geçiş yapar |

---

### Paylaşma Özelliği

**Link Paylaş** düğmesine tıkladığınızda, site şifreli mesajınızı kodlayan özel bir URL oluşturur. Bu linki kopyalayıp herkese gönderebilirsiniz — açtıklarında site şifreli metninizi otomatik olarak yükler ve onlar da çözebilir.

> Tüm şifreleme tamamen tarayıcınızda çalışır. Hiçbir veri hiçbir sunucuya gönderilmez.

---

### Teknik Altyapı

- Saf HTML, CSS, JavaScript — sıfır bağımlılık, sıfır framework
- GitHub Pages üzerinde barındırılıyor (ücretsiz)
- XSS koruması için Content Security Policy başlıkları
- Tüm kullanıcı girişlerinde input sanitizasyonu

---

### Yerel Olarak Çalıştır

```bash
git clone https://github.com/ebubekir23/cryptomuseum.git
cd cryptomuseum
# index.html dosyasını tarayıcıda aç — derleme adımı gerekmez
```

---

*[Ebubekir Yılmaz](https://github.com/ebubekir23) tarafından yapıldı — Yazılım Mühendisliği, 1. Sınıf*
