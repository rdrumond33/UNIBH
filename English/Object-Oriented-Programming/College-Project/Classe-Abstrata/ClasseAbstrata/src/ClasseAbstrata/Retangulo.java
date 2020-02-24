/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseAbstrata;

public class Retangulo extends Figura{
	private double altura;
	private double largura;
		
	public Retangulo(String cor, double altura, double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}
	
	@Override
	public double area(){
		return altura * largura;
	}
	
	@Override
	public double perimetro(){
		return 2*altura + 2* largura;
	}
}

