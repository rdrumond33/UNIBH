package exercicio_C;

public class Observer3 extends Observer{


	public Observer3(Sujeito sujeito) {
		this.sujeito=sujeito;
		this.sujeito.attach(this);
	}
	
	public void update(String m) {
		
		System.out.println("Observer3: " + m);
	}

}
