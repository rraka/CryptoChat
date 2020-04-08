/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.time.chrono.ThaiBuddhistChronology;
import cryptochat.gui.Login;

/**
 *
 * @author raka
 */
public class Main {
    public static void main(String []args){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
        thread.start();
    }
}
