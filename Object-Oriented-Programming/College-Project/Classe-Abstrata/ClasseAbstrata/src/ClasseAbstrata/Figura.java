/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseAbstrata;


public abstract class Figura {

    private String cor;

    public Figura(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public abstract double perimetro();

    public abstract double area();
}
