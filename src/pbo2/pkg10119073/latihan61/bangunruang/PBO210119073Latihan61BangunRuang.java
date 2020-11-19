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

public class PBO210119073Latihan61BangunRuang {

    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setR(7);
        System.out.println("Volume Bola = "+Math.ceil(bola.hitungVolume())+" cm\u00B3");
        
        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setT(21);
        System.out.println("Volume Tabung = "+Math.ceil(tabung.hitungVolume())+" cm\u00B3");
        
        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.println("Volume Kerucut = "+Math.ceil(kerucut.hitungVolume())+" cm\u00B3");
    }
    
}
