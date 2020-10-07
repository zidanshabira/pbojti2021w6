/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
/**
 *
 * @author Zidan
 */
public class TugasMain {
    public static void main(String[] args) {
        Dosen dos1=new Dosen();
        dos1.setNama("Alonso");
        dos1.setSKS(8);
        
        Pegawai pgw1=new Pegawai();
        pgw1.setNama("Mang Oleh");
        
        DaftarGaji daftar_gaji=new DaftarGaji(2);
        daftar_gaji.addPegawai(dos1);
        daftar_gaji.addPegawai(pgw1);
        daftar_gaji.printSemuaGaji();
    }
}
