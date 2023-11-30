/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilitarios;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.tomcat.util.codec.binary.Base64;

/**
 *
 * @author richard
 */
public class Cifrado {
    String LLAVE = "generador";
    
    public SecretKeySpec CrearClave(String llave) throws NoSuchAlgorithmException {
        try {

            byte[] cadena = llave.getBytes("UTF-8");

            MessageDigest md = MessageDigest.getInstance("SHA-1");
            cadena = md.digest(cadena);
            cadena = Arrays.copyOf(cadena, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(cadena, "AES");
            return secretKeySpec;

        } catch (UnsupportedEncodingException e) {

        }
        return null;
    }

    public String Encriptar(String Encriptar) {
        try {

            SecretKeySpec secretKeySpec = CrearClave(LLAVE);
            Cipher c = Cipher.getInstance("AES");
            c.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] cadena = Encriptar.getBytes("UTF-8");
            byte[] encriptada = c.doFinal(cadena);
            String cadenaEncriptada= Base64.encodeBase64String(encriptada);
            return cadenaEncriptada;
            
        } catch (Exception e) {

        }
        return null;
    }
    
    public String Desencriptar(String Desncriptar) {
        try {

            SecretKeySpec secretKeySpec = CrearClave(LLAVE);
            Cipher c = Cipher.getInstance("AES");
            c.init(Cipher.DECRYPT_MODE, secretKeySpec);
            
            byte[] cadena = Base64.decodeBase64(Desncriptar);
            byte[] desencriptada = c.doFinal(cadena);
            String cadenaDesencriptada= new String(desencriptada) ;
            return cadenaDesencriptada;
            
        } catch (Exception e) {

        }
        return null;
    }
    
}
