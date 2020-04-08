/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptochat.helper;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

/**
 *
 * @author raka
 */
public class Password {
    public static void main(String[] args) throws NoSuchAlgorithmException{
        char[] password = {'a'};
        Base64.Encoder base64 = Base64.getEncoder();
        System.out.println("Salt base64 enkodovan: " + base64.encodeToString(getSalt()));
        System.out.println("Hash+salt base64 enkodovan: " + base64.encodeToString(getPasswordHash(getSalt(), password)));
        
        
        
    }
    
    public static byte[] getSalt(){
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[20];
        random.nextBytes(salt);
        return salt;
    }
    
    public static byte[] getPasswordHash(byte[] salt, char[] password) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(salt);
        byte[] hash = md.digest(String.valueOf(password).getBytes());
        return hash;
    }
}
