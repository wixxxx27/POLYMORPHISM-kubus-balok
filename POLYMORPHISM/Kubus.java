package POLYMORPHISM;


public class Kubus extends PerhitunganBangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return hitungVolume(sisi);
    }

    public double hitungLuasPermukaan() {
        return hitungLuasPermukaan(sisi);
    }
}
