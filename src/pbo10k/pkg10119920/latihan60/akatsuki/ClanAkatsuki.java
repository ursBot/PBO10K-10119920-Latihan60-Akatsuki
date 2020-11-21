/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan60.akatsuki;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class ClanAkatsuki {
    
    public static void main(String[] args) {
        
        Pemimpin p = new Pemimpin("Pain Rikudo", "Amegakure", "Konan");
        p.setPemimpin("Pemimpin");
        p.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + p.getPemimpin());
        System.out.println();
    
        Anggota a = new Anggota("Itachi Uciha", "Konohagakure", "Kisame Hoshigaki");
        a.setAnggota("Anggota");
        a.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + a.getAnggota());
        System.out.println();
        
        Anggota b = new Anggota("Hidan", "Yugakure", "Kakuzu");
        b.setAnggota("Anggota");
        b.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + b.getAnggota());
    }
}
