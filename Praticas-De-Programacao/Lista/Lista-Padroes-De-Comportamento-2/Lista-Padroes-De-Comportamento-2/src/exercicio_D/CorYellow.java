package exercicio_D;

public class CorYellow  implements Cor{
	@Override
	public void doAction(Material material) {
		System.out.println("A cor do material e Amarelo ");
		material.setCor(this);
		
	}
	public String toString() {
		return "Mudar de cor";
	}
	
}
