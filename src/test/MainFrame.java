/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JFrame;

/**
 *
 * @author Aldy
 */
public class MainFrame extends JFrame {

    public static void main(String[] args) {
        testMainFrame test = new testMainFrame();
        test.setSize(400, 400);
        test.setVisible(true);
        test.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
