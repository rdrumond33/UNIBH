package lista_8_Command;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor motor = new MotorPortao();
		Motor motorB = new MotorPortaoB();
		
		
		DesligarComando desligar = new DesligarComando(motor);
		LigarComando ligar = new LigarComando(motor);
		
		DesligarComando desligarB = new DesligarComando(motorB);
		LigarComando ligarB = new LigarComando(motorB);
		
		
		Controle comando = new Controle() ;
		
		comando.pegarComando(ligar);

		comando.pegarComando(desligar);

		
		
		comando.pegarComando(ligarB);

		comando.pegarComando(desligarB);
	
		comando.executarCoamdos();
	}

}
