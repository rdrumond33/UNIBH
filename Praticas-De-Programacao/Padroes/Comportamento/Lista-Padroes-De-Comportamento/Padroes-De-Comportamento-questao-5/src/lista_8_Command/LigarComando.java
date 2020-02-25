package lista_8_Command;

public class LigarComando implements Comando{

	private Motor motor;

	 public LigarComando(Motor motor) {
			this.motor = motor;
	
	}
	
	@Override
	public void executar() {
		// TODO Auto-generated method stub
		motor.Ligar();

	}

	
	
}
