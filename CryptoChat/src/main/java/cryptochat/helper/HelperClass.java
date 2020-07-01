/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptochat.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raka
 */
public class HelperClass {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException{
       int maxKeySize = javax.crypto.Cipher.getMaxAllowedKeyLength("AES");
System.out.println("Max Key Size for AES : " + maxKeySize);
    }
    
    public static void ucitajAktivneKorisnike(String korisnickoIme, DefaultTableModel tabelaModel) throws IOException {
        
        
        int rowCount = tabelaModel.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            tabelaModel .removeRow(i);
        }
        BufferedReader reader = new BufferedReader(new FileReader("../aktivniKorisnici.txt"));
        ArrayList<String> listaAktivnihKorisnika = new ArrayList();
        String line = null;
        while ((line=reader.readLine()) != null) {   
            if(listaAktivnihKorisnika.contains(line) == false)
            listaAktivnihKorisnika.add(line);
        }
        
        for(Object aktivniKorisnik : listaAktivnihKorisnika){
            tabelaModel.addRow(new Object[] {aktivniKorisnik});
        }
        
       reader.close();
    }
}
