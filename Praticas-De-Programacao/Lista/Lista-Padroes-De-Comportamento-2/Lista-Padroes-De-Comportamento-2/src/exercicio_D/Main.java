package exercicio_D;

public class Main {

	public static void main(String[] args) {
		Material material = new Material();
		
		CorBlue blue = new CorBlue();
		blue.doAction(material);
		
		System.out.println(blue.toString());

		CorGreen green  = new CorGreen();
		green.doAction(material);
		
		System.out.println(blue.toString());
		
		CorYellow yellow  = new CorYellow();
		yellow.doAction(material);
		
		
		
	}

}
