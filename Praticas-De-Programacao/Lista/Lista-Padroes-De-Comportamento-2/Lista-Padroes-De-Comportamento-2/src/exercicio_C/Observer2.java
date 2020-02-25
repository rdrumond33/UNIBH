package exercicio_C;

public class Observer2 extends Observer {


	public Observer2(Sujeito sujeito) {
		this.sujeito=sujeito;
		this.sujeito.attach(this);
	}
	
	
	public void update(String m) {
		
		System.out.println("Observer2: " +m);
	}

	
}
