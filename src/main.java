/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jmarser
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String claveEncriptacion = "pruebaInsti";
        
        String original = "En un ligar de la mancha";
        
        EncriptadorAES encriptador = new EncriptadorAES();
        
        String encriptado = encriptador.encriptar(original, claveEncriptacion);
        String desencriptado = encriptador.desencriptar(encriptado, claveEncriptacion);
        
        System.out.println("Cadena original: "+original);
        System.out.println("Cadena encriptada: "+encriptado);
        System.out.println("Cadena desencriptada: "+desencriptado);
    }
    
}
