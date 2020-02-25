package exercicio_C;

public class Main {

	public static void main(String[] args) {
		Sujeito sujeito = new Sujeito();
		
		new Observer1(sujeito);
		new Observer2(sujeito);
		new Observer3(sujeito);
		new Observer4(sujeito);
		
		System.out.println("teste");
		sujeito.Frase("Observe1 Observe2 Observe3 Observe4");
	
		System.out.println("\nteste 2");
		sujeito.Frase("Teste Teste2 Teste3 teste4");
	
	}

}
