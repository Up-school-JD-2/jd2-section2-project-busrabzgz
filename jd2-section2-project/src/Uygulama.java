public class Uygulama {
    private String adi;
    private String surumu;
    private int boyutu;

    public Uygulama(String adi, String surumu, int boyutu) {
        this.adi = adi;
        this.surumu = surumu;
        this.boyutu = boyutu;
    }

    // Getters and setters

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSurumu() {
        return surumu;
    }

    public void setSurumu(String surumu) {
        this.surumu = surumu;
    }

    public int getBoyutu() {
        return boyutu;
    }

    public void setBoyutu(int boyutu) {
        this.boyutu = boyutu;
    }
}
