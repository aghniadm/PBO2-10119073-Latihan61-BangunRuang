package pbo2.pkg10119073.latihan61.bangunruang;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung volume bangun ruang
 * dengan konsep abstract class
 *
 */

public class Tabung extends BangunRuang{
    private int r, t;

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
    
    @Override
    public double hitungVolume() {
        return Math.PI * r * r * t;
    }
}
