package exercicio_D;

public class CorBlue implements Cor{

	@Override
	public void doAction(Material material) {
		System.out.println("A cor do material e azul ");
		material.setCor(this);
		
	}
	
	public String toString() {
		return "Mudar de cor";
	}
	

}
