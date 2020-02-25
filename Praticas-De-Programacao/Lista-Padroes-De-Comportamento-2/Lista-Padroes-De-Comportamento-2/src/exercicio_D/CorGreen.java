package exercicio_D;

public class CorGreen implements Cor {

	@Override
	public void doAction(Material material) {
		System.out.println("A cor do material e Verde ");
		material.setCor(this);
		
	}
	
	public String toString() {
		return "Mudar de cor";
	}
	
}
