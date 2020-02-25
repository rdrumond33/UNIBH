package questao_3;

public class DesligarComando implements Comando {

	private Motor motor;
	
	
	public DesligarComando (Motor motor) {
		this.motor = motor;
	}
	
	@Override
	public void executar() {

		motor.Desligar();
		
	}

}
