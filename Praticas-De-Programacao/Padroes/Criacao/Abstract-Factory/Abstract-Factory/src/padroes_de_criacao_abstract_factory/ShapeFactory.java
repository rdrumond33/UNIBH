package padroes_de_criacao_abstract_factory;
public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("circulo")) {
			return new Circulo();

		} else if (shape.equalsIgnoreCase("retangulo")) {
			return new Retangulo();

		} else if (shape.equalsIgnoreCase("Quadrado")) {
			return new Quadrado();
		}
		return null;
	}

}
