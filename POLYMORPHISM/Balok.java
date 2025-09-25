package POLYMORPHISM;


public class Balok extends PerhitunganBangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return hitungVolume(panjang, lebar, tinggi);
    }

    public double hitungLuasPermukaan() {
        return hitungLuasPermukaan(panjang, lebar, tinggi);
    }
}
