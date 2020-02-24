/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseAbstrata;

/**
 *
 * @author Felipe Leandro
 */
public class Figura_geometrica {
     
    public static void main(String[] args){
        Circunferencia C1 = new Circunferencia("Azul",8);
        Retangulo R1 = new Retangulo("Amarelo",10,20);
        //Figura F1 = new Figura("Verde"); Uma classe abstrata não pode ser instanciada
        System.out.println("Area do Circunferencia: " + C1.area());
        System.out.println("Area do Retangulo: " + R1.area());
        
    }
}
