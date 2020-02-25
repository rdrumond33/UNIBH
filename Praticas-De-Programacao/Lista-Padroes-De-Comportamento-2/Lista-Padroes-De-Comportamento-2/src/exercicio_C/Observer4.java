package exercicio_C;

public class Observer4 extends Observer{


	public Observer4(Sujeito sujeito) {
		this.sujeito=sujeito;
		this.sujeito.attach(this);
	}
	
	public void update(String m) {
		
		System.out.println("Observer4: " +m);
	}

}
