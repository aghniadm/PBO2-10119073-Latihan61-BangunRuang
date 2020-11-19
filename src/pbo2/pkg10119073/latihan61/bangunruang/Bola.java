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

public class Bola extends BangunRuang{
    private int r;

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
    @Override
    public double hitungVolume() {
        return (4 * Math.PI * (r * r * r)) / 3;
    }
}
