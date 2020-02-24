/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseAbstrata;

public class Circunferencia extends Figura {
	
	private double raio;
	public Circunferencia(String cor, double raio) {
		super(cor);
		
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area(){
		return Math.PI * Math.pow(raio, 2);
	}
	
	@Override
	public double perimetro(){
		return 2* Math.PI * raio;
	}
}
