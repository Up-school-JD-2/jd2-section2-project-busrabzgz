public class Kisi {
    private String adi;
    private String soyadi;
    private String telefonNumarasi;
    private String epostaAdresi;

    public Kisi(String adi, String soyadi, String telefonNumarasi, String epostaAdresi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.telefonNumarasi = telefonNumarasi;
        this.epostaAdresi = epostaAdresi;
    }

    // Getters and setters

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    public String getEpostaAdresi() {
        return epostaAdresi;
    }

    public void setEpostaAdresi(String epostaAdresi) {
        this.epostaAdresi = epostaAdresi;
    }
}
