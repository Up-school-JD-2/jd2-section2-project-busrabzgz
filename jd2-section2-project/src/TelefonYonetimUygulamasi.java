import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TelefonYonetimUygulamasi {
    private ArrayList<Telefon> telefonlar;
    private ArrayList<Uygulama> uygulamalar;
    private ArrayList<Kisi> kisiler;
    private int toplamDepolamaAlani;
    private int bosDepolamaAlani;

    public TelefonYonetimUygulamasi() {
        telefonlar = new ArrayList<>();
        uygulamalar = new ArrayList<>();
        kisiler = new ArrayList<>();
        toplamDepolamaAlani = 0;
        bosDepolamaAlani = 0;
    }

    public void baslat() {
        Scanner scanner = new Scanner(System.in);
        boolean devam = true;

        while (devam) {
            System.out.println("1. Telefon Ekle");
            System.out.println("2. Uygulama Yönetimi");
            System.out.println("3. Kişi Yönetimi");
            System.out.println("4. Depolama Alanı Kontrolü");
            System.out.println("5. Veri Yedekleme");
            System.out.println("6. Veri Geri Yükleme");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    telefonEkle();
                    break;
                case 2:
                    uygulamaYonetimi();
                    break;
                case 3:
                    kisiYonetimi();
                    break;
                case 4:
                    depolamaAlaniKontrolu();
                    break;
                case 5:
                    veriYedekleme();
                    break;
                case 6:
                    veriGeriYukleme();
                    break;
                case 0:
                    devam = false;
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Tekrar deneyin.");
                    break;
            }
        }
    }

    public void telefonEkle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Marka: ");
        String marka = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        System.out.print("Seri Numarası: ");
        String seriNumarasi = scanner.nextLine();

        System.out.print("Depolama Alanı: ");
        int depolamaAlani = scanner.nextInt();

        System.out.print("İşletim Sistemi: ");
        String isletimSistemi = scanner.nextLine();

        Telefon telefon = new Telefon(marka, model, seriNumarasi, depolamaAlani, isletimSistemi);
        telefonlar.add(telefon);
        toplamDepolamaAlani += depolamaAlani;
        bosDepolamaAlani += depolamaAlani;

        System.out.println("Telefon başarıyla eklendi.");
    }

    public void uygulamaYonetimi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Uygulama Ekle");
        System.out.println("2. Uygulama Kaldır");
        System.out.println("3. Uygulama Güncelle");
        System.out.print("Seçiminizi yapın: ");
        int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                uygulamaEkle();
                break;
            case 2:
                uygulamaKaldir();
                break;
            case 3:
                uygulamaGuncelle();
                break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız. Tekrar deneyin.");
                break;
        }
    }

    public void uygulamaEkle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Uygulama Adı: ");
        String adi = scanner.nextLine();

        System.out.print("Uygulama Sürümü: ");
        String surumu = scanner.nextLine();

        System.out.print("Uygulama Boyutu: ");
        int boyutu = scanner.nextInt();

        Uygulama uygulama = new Uygulama(adi, surumu, boyutu);
        uygulamalar.add(uygulama);

        System.out.println("Uygulama başarıyla eklendi.");
    }

    public void uygulamaKaldir() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaldırılacak uygulamanın adını girin: ");
        String adi = scanner.nextLine();

        for (Uygulama uygulama : uygulamalar) {
            if (uygulama.getAdi().equals(adi)) {
                uygulamalar.remove(uygulama);
                System.out.println("Uygulama başarıyla kaldırıldı.");
                return;
            }
        }

        System.out.println("Belirtilen isimde bir uygulama bulunamadı.");
    }

    public void uygulamaGuncelle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Güncellenecek uygulamanın adını girin: ");
        String adi = scanner.nextLine();

        for (Uygulama uygulama : uygulamalar) {
            if (uygulama.getAdi().equals(adi)) {
                System.out.print("Yeni Uygulama Adı: ");
                String yeniAdi = scanner.nextLine();

                System.out.print("Yeni Uygulama Sürümü: ");
                String yeniSurumu = scanner.nextLine();

                System.out.print("Yeni Uygulama Boyutu: ");
                int yeniBoyutu = scanner.nextInt();

                uygulama.setAdi(yeniAdi);
                uygulama.setSurumu(yeniSurumu);
                uygulama.setBoyutu(yeniBoyutu);

                System.out.println("Uygulama başarıyla güncellendi.");
                return;
            }
        }

        System.out.println("Belirtilen isimde bir uygulama bulunamadı.");
    }

    public void kisiYonetimi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Kişi Ekle");
        System.out.println("2. Kişi Düzenle");
        System.out.println("3. Kişi Sil");
        System.out.print("Seçiminizi yapın: ");
        int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                kisiEkle();
                break;
            case 2:
                kisiDuzenle();
                break;
            case 3:
                kisiSil();
                break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız. Tekrar deneyin.");
                break;
        }
    }

    public void kisiEkle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kişinin Adı: ");
        String adi = scanner.nextLine();

        System.out.print("Kişinin Soyadı: ");
        String soyadi = scanner.nextLine();

        System.out.print("Kişinin Telefon Numarası: ");
        String telefonNumarasi = scanner.nextLine();

        System.out.print("Kişinin E-posta Adresi: ");
        String epostaAdresi = scanner.nextLine();

        Kisi kisi = new Kisi(adi, soyadi, telefonNumarasi, epostaAdresi);
        kisiler.add(kisi);

        System.out.println("Kişi başarıyla eklendi.");
    }

    public void kisiDuzenle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Düzenlenecek kişinin adını girin: ");
        String adi = scanner.nextLine();

        for (Kisi kisi : kisiler) {
            if (kisi.getAdi().equals(adi)) {
                System.out.print("Yeni Kişinin Adı: ");
                String yeniAdi = scanner.nextLine();

                System.out.print("Yeni Kişinin Soyadı: ");
                String yeniSoyadi = scanner.nextLine();

                System.out.print("Yeni Kişinin Telefon Numarası: ");
                String yeniTelefonNumarasi = scanner.nextLine();

                System.out.print("Yeni Kişinin E-posta Adresi: ");
                String yeniEpostaAdresi = scanner.nextLine();

                kisi.setAdi(yeniAdi);
                kisi.setSoyadi(yeniSoyadi);
                kisi.setTelefonNumarasi(yeniTelefonNumarasi);
                kisi.setEpostaAdresi(yeniEpostaAdresi);

                System.out.println("Kişi başarıyla düzenlendi.");
                return;
            }
        }

        System.out.println("Belirtilen isimde bir kişi bulunamadı.");
    }

    public void kisiSil() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Silinecek kişinin adını girin: ");
        String adi = scanner.nextLine();

        for (Kisi kisi : kisiler) {
            if (kisi.getAdi().equals(adi)) {
                kisiler.remove(kisi);
                System.out.println("Kişi başarıyla silindi.");
                return;
            }
        }

        System.out.println("Belirtilen isimde bir kişi bulunamadı.");
    }

    public void depolamaAlaniKontrolu() {
        int toplamDepolama = 0;
        int kullanilanDepolama = 0;

        for (Telefon telefon : telefonlar) {
            toplamDepolama += telefon.getDepolamaAlani();
        }

        for (Uygulama uygulama : uygulamalar) {
            kullanilanDepolama += uygulama.getBoyutu();
        }

        int bosDepolama = toplamDepolama - kullanilanDepolama;

        System.out.println("Toplam Depolama Alanı: " + toplamDepolama + " GB");
        System.out.println("Mevcut Boş Alan: " + bosDepolama + " GB");
    }
    public void veriGeriYukleme() {
        try {
            FileInputStream fileIn = new FileInputStream("veri_yedekleme.ser");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            telefonlar = (ArrayList<Telefon>) objIn.readObject();
            uygulamalar = (ArrayList<Uygulama>) objIn.readObject();
            kisiler = (ArrayList<Kisi>) objIn.readObject();

            objIn.close();
            fileIn.close();

            System.out.println("Veriler başarıyla geri yüklendi.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Veri geri yükleme işlemi başarısız oldu: " + e.getMessage());
        }
    }
    public void veriYedekleme() {
        try {
            FileOutputStream fileOut = new FileOutputStream("veri_yedekleme.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            objOut.writeObject(telefonlar);
            objOut.writeObject(uygulamalar);
            objOut.writeObject(kisiler);

            objOut.close();
            fileOut.close();

            System.out.println("Veriler başarıyla yedeklendi.");
        } catch (IOException e) {
            System.out.println("Veri yedekleme işlemi başarısız oldu: " + e.getMessage());
        }
    }
}