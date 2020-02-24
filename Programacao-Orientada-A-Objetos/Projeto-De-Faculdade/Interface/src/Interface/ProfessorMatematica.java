/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Felipe Leandro
 */
public class ProfessorMatematica implements Matematica {

    public double hipotenusa(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public double perimetroCircunferencia(double raio) {
        return 2 * PI * raio;
    }
    
    public static void main(String[] args){
    
       Matematica M = new ProfessorMatematica();
       System.out.println(M.perimetroCircunferencia(10));
    
    }

}
