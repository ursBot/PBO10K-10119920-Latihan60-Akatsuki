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
public class Pemimpin extends Akatsuki{
    
    private String pemimpin;
    
    public Pemimpin(String nama, String desa, String rekan) {
        super(nama, desa, rekan);
        this.nama = nama;
        this.desa = desa;
        this.rekan = rekan;
    }

    public String getPemimpin() {
        return pemimpin;
    }
    public void setPemimpin(String pemimpin) {
        this.pemimpin = pemimpin;
    }
}
