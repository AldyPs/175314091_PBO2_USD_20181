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
 * @author Aldy
 */
public class TambahAntrianDialog extends JDialog implements ActionListener {

    private JLabel namaLabel;
    private JLabel labelNama, labelAlamat, noRM;
    private JTextField textNama, textAlamat, textRM;

    public TambahAntrianDialog() {
        init();
    }

    public void init() {
        this.setLayout(null);

        namaLabel = new JLabel("Form Daftar Antrian");
        namaLabel.setBounds(150, 30, 250, 20);
        this.add(namaLabel);

        noRM = new JLabel("no RM");
        noRM.setBounds(20, 60, 50, 30);
        this.add(noRM);

        textRM = new JTextField();
        textRM.setBounds(80, 60, 200, 30);
        this.add(textRM);
        textRM.addActionListener(this);

        labelNama = new JLabel("Nama");
        labelNama.setBounds(20, 100, 50, 30);
        this.add(labelNama);

        textNama = new JTextField("");
        textNama.setBounds(80, 100, 200, 30);
        this.add(textNama);

        labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(20, 140, 50, 30);
        this.add(labelAlamat);

        textAlamat = new JTextField("");
        textAlamat.setBounds(80, 140, 200, 30);
        this.add(textAlamat);

    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == textRM) {
            if (Pasien.cariPasien(textRM.getText()) != null) {
                textNama.setText(Pasien.cariPasien(textRM.getText()).getNama());
                textAlamat.setText(Pasien.cariPasien(textRM.getText()).getAlamat());
            }else{
                JOptionPane.showMessageDialog(null, "Tidak Ada Data");
            }
        }

    }
}
