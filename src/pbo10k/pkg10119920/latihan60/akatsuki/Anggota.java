/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan60.akatsuki;

/**
 *
 * @author User
 */
public class Anggota extends Akatsuki{
    
    private String anggota;
    
    public Anggota(String nama, String desa, String rekan) {
        super(nama, desa, rekan);
        this.nama = nama;
        this.desa = desa;
        this.rekan = rekan;
    }

    public String getAnggota() {
        return anggota;
    }
    public void setAnggota(String anggota) {
        this.anggota = anggota;
    }
}
