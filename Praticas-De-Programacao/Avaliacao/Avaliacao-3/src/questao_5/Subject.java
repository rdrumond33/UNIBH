package questao_5;

import java.util.*;

public class Subject {



	private List<Observer> observadores = new ArrayList<Observer>();

	private Double num1;
	private Double num2;
	private Double num3;
	
	
	
	
	
	public Double getNum1() {
		return num1;
	}

	
	public Double getNum2() {
		return num2;
	}

	
	public Double getNum3() {
		return num3;
	}

	
	public void setNumero(Double num1,Double num2 , Double num3) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		
		notficacao();
	}
	
	public void notficacao() {
	
		for (Observer observer : observadores) {
			observer.update(this.num1, this.num2,this.num3);
			
		}
	}
	
	public void attach(Observer observe) {
		observadores.add(observe);
	}
	
}