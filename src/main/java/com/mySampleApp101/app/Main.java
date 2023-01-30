package com.mySampleApp101.app;

import java.net.URL;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class Main {

    public Main() {
        String search = "asdf/logo_02.png";
        URL asdf = this.getClass().getClassLoader().getResource(search);

        System.out.println(asdf);

        JOptionPane.showInputDialog(null, search + "\n gefunden: " + asdf);

    }
    public static void main( String[] args ) {
        new Main();
    }
}
