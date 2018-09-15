/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.Pasien;

/**
 *
 * @author jarkom
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener {

    private JLabel namaLabel, jenisKelamin;
    private JLabel judulLabel, noNIK, labelAlamat,labelTanggal,labelTahun,labelBulan;
    private JTextField namaText, textNIK, textAlamat;
    private JButton saveBotton;
    private JRadioButton lakiLaki, wanita;
    private JComboBox tanggalBox, BulanBox, TahunBox;
    private String tanggal[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27",
        "28", "29", "30", "31"};
    private String bulan[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12"};
    private String tahun[] = {"1990", "1991", "1992", "1993", "1994", "1995",
        "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
         "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012",
         "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"};

    public TambahPasienBaruDialog() {
        init();

    }

    /**
     * method ini berfungsi untuk menginputkan data atau format Label yang ingin
     * dibuat
     */
    public void init() {
        this.setLayout(null);
        //untuk judul label yaitu "Form Daftar Antrian", dan menginputkan
        //data (150 yang berarti panajang x, 30 yang berarti panjang y,
        //250 untuk panjang tulisan dan 20 untuk tebal atau tinggi tulisan)
        judulLabel = new JLabel("Form Daftar Antrian");
        judulLabel.setBounds(150, 30, 250, 20);
        this.add(judulLabel);

        //untuk "No RM", dan menginputkan data (20 yang berarti panjang x,
        //60 yang berarti panjang y, 100 untuk panjang tulisan "No RM",
        //dan 30 untuk tebal atau tinggi tulisan "No RM") 
        noNIK = new JLabel("NIK");
        noNIK.setBounds(20, 60, 100, 30);
        this.add(noNIK);

        //mengatur kotak untuk mengisi data pada "No RM", yaitu 80 yang berarti
        // panjang x dari samping Label, 60 yang berarti panjang y dari atas Label
        //menuju ke bawah, 200 panjang kotak untuk mengisi data, 30 tinggi kotak
        //untuk mengisi data
        textNIK = new JTextField("");
        textNIK.setBounds(80, 60, 200, 30);
        this.add(textNIK);

        //untuk "Nama", dan menginputkan data (20 yang berarti panjang x,
        //100 yang berarti panjang y, 50 untuk panjang tulisan "Nama",
        //dan 30 untuk tebal atau tinggi tulisan "Nama")
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 100, 50, 30);
        this.add(namaLabel);

        //mengatur kotak untuk mengisi data pada "Nama", yaitu 80 yang berarti
        // panjang x dari samping Label, 100 yang berarti panjang y dari atas Label
        //menuju ke bawah, 200 panjang kotak untuk mengisi data, 30 tinggi kotak
        //untuk mengisi data
        namaText = new JTextField("");
        namaText.setBounds(80, 100, 200, 30);
        this.add(namaText);

        //untuk "Alamat", dan menginputkan data (20 yang berarti panjang x,
        //140 yang berarti panjang y, 50 untuk panjang tulisan "Alamat",
        //dan 30 untuk tebal atau tinggi tulisan "Alamat")
        labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(20, 140, 50, 30);
        this.add(labelAlamat);

        //mengatur kotak untuk mengisi data pada "Alamat", yaitu 80 yang berarti
        // panjang x dari samping Label, 140 yang berarti panjang y dari atas Label
        //menuju ke bawah, 200 panjang kotak untuk mengisi data, 30 tinggi kotak
        //untuk mengisi data
        textAlamat = new JTextField("");
        textAlamat.setBounds(80, 140, 200, 30);
        this.add(textAlamat);

        //untuk "Kelamin", dan menginputkan data (20 yang berarti panjang x,
        //180 yang berarti panjang y, 50 untuk panjang tulisan "Kelamin",
        //dan 30 untuk tebal atau tinggi tulisan "Kelamin")
        jenisKelamin = new JLabel("Jenis Kelamin");
        jenisKelamin.setBounds(20, 180, 50, 30);
        this.add(jenisKelamin);

        lakiLaki = new JRadioButton("Pria", true);
        lakiLaki.setBounds(80, 180, 200, 30);
        this.add(lakiLaki);

        wanita = new JRadioButton("Wanita", false);
        wanita.setBounds(80, 210, 200, 30);
        this.add(wanita);

        ButtonGroup kelaminButtonGroup = new ButtonGroup();
        kelaminButtonGroup.add(wanita);
        kelaminButtonGroup.add(lakiLaki);

        saveBotton = new JButton("Simpan");
        saveBotton.setBounds(80, 300, 100, 30);
        this.add(saveBotton);
        saveBotton.addActionListener(this);
        
        labelTanggal = new JLabel("Tanggal");
        labelTanggal.setBounds(20, 250, 50, 30);
        this.add(labelTanggal);
        
        tanggalBox = new JComboBox(tanggal);
        tanggalBox.setBounds(70, 250, 50, 30);
        this.add(tanggalBox);
        
        labelBulan = new JLabel("Bulan");
        labelBulan.setBounds(130, 250, 50, 30);
        this.add(labelBulan);
        
        BulanBox = new JComboBox(bulan);
        BulanBox.setBounds(170, 250, 50, 30);
        this.add(BulanBox);
        
        labelTahun = new JLabel("Tahun");
        labelTahun.setBounds(220, 250, 50, 30);
        this.add(labelTahun);
        
        TahunBox = new JComboBox(tahun);
        TahunBox.setBounds(260, 250, 70, 30);
        this.add(TahunBox);
        
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == saveBotton) {
            Pasien pasien = new Pasien();
            pasien.setNoRekamMedis(textNIK.getText());
            pasien.setNama(namaText.getText());
            pasien.setAlamat(textAlamat.getText());
            Pasien.tambahPasienBaru(pasien);
            JOptionPane.showMessageDialog(null, "Telah Ditambahkan");
            this.dispose();
        }
    }
}
