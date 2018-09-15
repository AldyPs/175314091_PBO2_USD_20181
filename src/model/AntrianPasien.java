/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jarkom
 */
public class AntrianPasien {
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAAntrian;
    private Klinik klinik;
    private final int jumlah_maksimal_pasien = 50;
    private Pasien[] daftarPasien = new Pasien[jumlah_maksimal_pasien];
    private int nomorAntrian=0;
    
    
     public AntrianPasien() {
    }

    public AntrianPasien(int tanggalAntrian, int bulanAntrian, int tahunAAntrian, Klinik klinik, Pasien[] daftarPasien) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
        this.tahunAAntrian = tahunAAntrian;
        this.klinik = klinik;
        this.daftarPasien = daftarPasien;
    }

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    public int getTahunAAntrian() {
        return tahunAAntrian;
    }

    public void setTahunAAntrian(int tahunAAntrian) {
        this.tahunAAntrian = tahunAAntrian;
    }

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public Pasien[] getDaftarPasien() {
        return daftarPasien;
    }

    public void setDaftarPasien(Pasien[] daftarPasien) {
        this.daftarPasien = daftarPasien;
    }
    /**
     * fungsi ini digunakan untuk pasien baru di nomor antrian
     * @param pasien
     * @throws Exception 
     */

    public void mendaftar(Pasien pasien) throws Exception{
        
        //nomor antrian dibandingkan dengan jumlah maksimal pasien yang dilayar
        if(nomorAntrian < jumlah_maksimal_pasien){
        daftarPasien[nomorAntrian] = pasien;
        nomorAntrian++;
        }else{
            //antrian sudah penuh
            throw new Exception("antrian penuh coyy");
        }
    }
    /**
     * fungsi ini digunakan untuk memanggil antrian pasien yang dilakukan oleh Dokter
     * @param nomorAntrian
     * @return 
     */
    public Pasien panggilPasien(int nomorAntrian){
        return daftarPasien[nomorAntrian];
    }
}
