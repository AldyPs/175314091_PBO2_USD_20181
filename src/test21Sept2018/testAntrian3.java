/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test21Sept2018;

import model.AntrianPasien;
import model.Klinik;
import model.Pasien;

/**
 *
 * @author jarkom
 */
public class testAntrian3 {

    public static void main(String[] args) {

        AntrianPasien.buatAntrian(
                21,
                9,
                2018,
                new Klinik("001", "anak"));

        AntrianPasien.buatAntrian(
                21,
                9,
                2018,
                new Klinik("002", "saraf"));

        AntrianPasien.buatAntrian(
                21,
                9,
                2018,
                new Klinik("001", "anak"));
        for (int i = 0; i < AntrianPasien.daftarAntrian.size(); i++) {
            System.out.println(AntrianPasien.daftarAntrian.get(i));
        }

        Pasien pasien1 = new Pasien();
        pasien1.setNama("puspa");
        pasien1.setAlamat("klaten");

        Pasien pasien2 = new Pasien();
        pasien2.setNama("adi");
        pasien2.setAlamat("klaten");

        AntrianPasien testAntrian = AntrianPasien.cariAntrian(21, 9, 2018, new Klinik("001", "anak"));
        if (testAntrian != null) {
            testAntrian.mendaftar(pasien1);
            testAntrian.mendaftar(pasien2);
        }
        for (int i = 0; i < testAntrian.getDaftarPasien().size(); i++) {
            System.out.println(testAntrian.getDaftarPasien().get(i));
        }
    }
}
