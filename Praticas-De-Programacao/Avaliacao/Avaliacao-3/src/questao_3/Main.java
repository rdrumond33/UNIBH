package questao_3;

public class Main {

	public static void main(String[] args) {

		Motor motor = new MotorPortao();

		DesligarComando desligar = new DesligarComando(motor);
		LigarComando ligar = new LigarComando(motor);

		Controle comando = new Controle();

		comando.pegarComando(ligar);

		comando.pegarComando(desligar);
	
		comando.executarCoamdos();
	}

}
