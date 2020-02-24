/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Felipe Leandro
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pessoa P1 = new pessoa("Joao","98877656","fulano1@gmail.com");
        P1.ImprimiDados();
        
        fisica P2 = new fisica("Maria","98877656","fulano2@gmail.com", "09887789-08");
        P2.ImprimiDados();
        
        juridica P3 = new juridica("Maria3","98877656","fulano3@gmail.com", "09887789-08");
        P3.ImprimiDados();
    }
    
}
