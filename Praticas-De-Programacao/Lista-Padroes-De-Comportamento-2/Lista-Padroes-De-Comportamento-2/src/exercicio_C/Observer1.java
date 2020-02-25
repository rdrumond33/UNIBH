package exercicio_C;

public class Observer1 extends Observer {

	public Observer1(Sujeito sujeito) {
		this.sujeito=sujeito;
		this.sujeito.attach(this);
	}
	
	public void update(String m) {
		
		System.out.println("Observer1: "+m);
	}

	
	
}
