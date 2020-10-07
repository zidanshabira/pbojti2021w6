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
public class DaftarGaji {
    public Pegawai[]listPegawai;
    public int jumlahPegawai=0;
    
    public DaftarGaji(int jumlah_pegawai){
        listPegawai=new Pegawai[jumlah_pegawai];
    }
    
    public void addPegawai(Pegawai pgw){
        listPegawai[jumlahPegawai]=pgw;
        jumlahPegawai++;
    }
    
    public void printSemuaGaji(){
        for(int i=0;i<jumlahPegawai;i++){
            System.out.println(listPegawai[i].getNama()+"Jumlah Gaji:");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}
