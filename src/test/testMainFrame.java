/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import test.MainFrame;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import view.TambahPasienBaruDialog;
import view.TambahAntrianDialog;

/**
 *
 * @author Aldy
 */
public class testMainFrame extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu menuPasien;
    private JMenuItem exitMenuItem;
    private JMenuItem tambahPasien;
    private JMenuItem tambahAntrian;
    
    public testMainFrame() {
        init();
    }
    
    public void init() {
        this.setLayout(null);
        this.setJMenuBar(menuBar);
        menuBar = new JMenuBar();
        fileMenu = new JMenu("Pasien");
        
        this.setTitle("frame");
        menuPasien = new JMenu("Menu");
        tambahPasien = new JMenuItem("Tambah Pasien");
        tambahAntrian = new JMenuItem("Tambah Antrian");
        exitMenuItem = new JMenuItem("EXIT");
        
        menuBar.add(fileMenu);
        this.setJMenuBar(menuBar);
        fileMenu.add(tambahPasien);
        fileMenu.add(tambahAntrian);
        fileMenu.add(exitMenuItem);

        tambahPasien.addActionListener(this);
        tambahAntrian.addActionListener(this);
        exitMenuItem.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent tambah) {
        if (tambah.getSource() == tambahPasien) {
            TambahPasienBaruDialog test = new TambahPasienBaruDialog();
            test.setSize(400, 400);
            test.setVisible(true);
        }
        if (tambah.getSource() == tambahAntrian) {
            TambahAntrianDialog test = new TambahAntrianDialog();
            test.setSize(400, 400);
            test.setVisible(true);
        }
        if (tambah.getSource() == exitMenuItem) {
            System.exit(0);
        }
    }
}
