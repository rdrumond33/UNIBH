package exercicio_C;

import java.util.*;

public class Sujeito {

	private List<Observer> observadores = new ArrayList<Observer>();
	private String sTringSplit[];
	public void Frase(String frase) {
		
		sTringSplit = frase.split(" ");
		notficacao();
	}
	
	public void notficacao() {
		int i =-1;
		for (Observer observer : observadores) {
			i++;
			observer.update(sTringSplit[i]);
			
		}
	}
	
	public void attach(Observer observe) {
		observadores.add(observe);
	}
	
}
