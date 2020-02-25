package exercicio_A;

public class Main {

	public static void main(String[] args) {

		User robert = new User("Robert");
		User john = new User("John");
		
		robert.sendMenssager("OI, John");
		john.sendMenssager("oi!");
		john.sendMenssager("como esta, robert!");
		robert.sendMenssager("bem");
		robert.sendMenssager("E vc?");
		
		Historico.Gravar("historico.txt", ChatRoom.historico());
		System.out.println("\n Lendo Arquivo historico");

		Historico.Read("historico.txt");
		
	}

}
