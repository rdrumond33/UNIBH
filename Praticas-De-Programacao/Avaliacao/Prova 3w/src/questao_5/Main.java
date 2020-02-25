package questao_5;

public class Main {

	public static void main(String[] args) {
	 	Subject subject = new Subject();
		
		new Soma(subject);
		new Media(subject);
		
		subject.setNumero(5.0,5.0,5.0);
		System.out.println();
		subject.setNumero(10.5, 11.0, 12.5);
	}

}
