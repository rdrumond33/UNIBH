package padroes_de_criacao_factory_method;

public class ShapeFactory {

	public Shape getShape(String type) {
	
		if (type.equalsIgnoreCase("Circulo")) {
			return new Circulo();
			
		}else if (type.equalsIgnoreCase("Retangulo")) {
			return new Retangulo();
			
		} else if (type.equalsIgnoreCase("Quadrado")) {
			return new Quadrado();
		} 
		
		
		return null;
	}
	
	
	
}
