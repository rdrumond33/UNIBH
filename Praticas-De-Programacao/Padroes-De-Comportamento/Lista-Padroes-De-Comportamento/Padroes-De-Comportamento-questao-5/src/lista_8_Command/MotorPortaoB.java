package lista_8_Command;


public class MotorPortaoB implements Motor {
	
	private final static int Ligar = 0;
	private final static int Desligar = 1;

	private int estado;

	
	
	public void Ligar() {
		setEstado(Ligar);
		System.out.println("MotorPortaoB ligado");
	}
	
	public void Desligar() {
		setEstado(Desligar);
		System.out.println("MotorPortaoB Desligado");
	}
	
	
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
	

	

}
