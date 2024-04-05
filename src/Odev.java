import java.util.Random;

public class Odev {
    public static void main(String[] args) {
        class ButunlemeDurumuMatris {

            public static void main(String[] args) {
                // Öğrenci sayısı ve notları saklamak için matris boyutları
                final int ogrenciSayisi = 50;
                final int notSayisi = 3; // Vize, Ödev, Final

                // Öğrenci isimleri ve soyisimleri
                String[] isimler = {"Veli", "Ahmet", "Mehmet", "Abubekir", "Ömer", "Osman", "Ali"};
                String[] soyisimler = {"Ak", "Pak", "Tak", "Hak", "Yak", "Sak", "Bak"};

                // Öğrenci bilgilerini saklamak için matris oluşturma
                int[][] ogrenciBilgileri = new int[ogrenciSayisi][notSayisi];

                // Rastgele sayı üretmek için Random sınıfı kullanma
                Random random = new Random();

                // Öğrenci bilgilerini rastgele oluşturma ve matrise yerleştirme
                for (int i = 0; i < ogrenciSayisi; i++) {
                    // Rastgele isim ve soyisim seçme
                    String adSoyad = isimler[random.nextInt(isimler.length)] + " " + soyisimler[random.nextInt(soyisimler.length)];

                    // Rastgele notlar oluşturma (50'den başlayarak 100'e kadar)
                    for (int j = 0; j < notSayisi; j++) {
                        ogrenciBilgileri[i][j] = 50 + random.nextInt(51);
                    }

                    // Öğrenci bilgilerini yazdırma
                    System.out.println(adSoyad + " -> Vize: " + ogrenciBilgileri[i][0] + ", Ödev: " + ogrenciBilgileri[i][1] + ", Final: " + ogrenciBilgileri[i][2]);
                }

                // Öğrenci bilgilerini işleme ve sonuçları yazdırma
                for (int i = 0; i < ogrenciSayisi; i++) {
                    String adSoyad = isimler[random.nextInt(isimler.length)] + " " + soyisimler[random.nextInt(soyisimler.length)];
                    int vizeNotu = ogrenciBilgileri[i][0];
                    int odevNotu = ogrenciBilgileri[i][1];
                    int finalNotu = ogrenciBilgileri[i][2];

                    // Yıl sonu notunu hesaplama
                    int yilSonuNotu = (int)((vizeNotu * 0.24) + (odevNotu * 0.16) + (finalNotu * 0.60));
                    // Bütünleme hakkını belirleme
                    boolean butunlemeHakki = (finalNotu >= 50 && yilSonuNotu >= 60) ? false : true;
                    // Bütünleme yapması gereken öğrenciler için minimum puanı belirleme
                    int minPuan = butunlemeHakki ? (int)Math.max(0, 100 - yilSonuNotu) : 0;

                    // Bütünleme durumunu yazdır
                    String butunlemeDurumu = butunlemeHakki ? "Bütünleme için giriş yapabilir." : "Bütünleme için giremez.";
                    System.out.println(adSoyad + " -> " + butunlemeDurumu + " Min Puan: " + minPuan);
                }
            }
        }
    }

}


