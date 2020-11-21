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

public class Akatsuki {
    
    protected String nama;
    protected String desa;
    protected String rekan;
    
    public Akatsuki(String nama, String desa, String rekan){
        this.nama = nama;
        this.desa = desa;
        this.rekan = rekan;
       }
    
    public void tampilAnggota(){
        System.out.println("Nama : "+ nama);
        System.out.println("Desa Awal : "+ desa);
        System.out.println("Rekan Tim : "+ rekan);
    } 
}
