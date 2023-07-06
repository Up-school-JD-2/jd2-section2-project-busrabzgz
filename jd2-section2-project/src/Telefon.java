public class Telefon {
    private String marka;
    private String model;
    private String seriNumarasi;
    private int depolamaAlani;
    private String isletimSistemi;

    public Telefon(String marka, String model, String seriNumarasi, int depolamaAlani, String isletimSistemi) {
        this.marka = marka;
        this.model = model;
        this.seriNumarasi = seriNumarasi;
        this.depolamaAlani = depolamaAlani;
        this.isletimSistemi = isletimSistemi;
    }

    public void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Seri Numarası: " + seriNumarasi);
        System.out.println("Depolama Alanı: " + depolamaAlani + " GB");
        System.out.println("İşletim Sistemi: " + isletimSistemi);
    }

    // Getters and setters

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeriNumarasi() {
        return seriNumarasi;
    }

    public void setSeriNumarasi(String seriNumarasi) {
        this.seriNumarasi = seriNumarasi;
    }

    public int getDepolamaAlani() {
        return depolamaAlani;
    }

    public void setDepolamaAlani(int depolamaAlani) {
        this.depolamaAlani = depolamaAlani;
    }

    public String getIsletimSistemi() {
        return isletimSistemi;
    }

    public void setIsletimSistemi(String isletimSistemi) {
        this.isletimSistemi = isletimSistemi;
    }
}
