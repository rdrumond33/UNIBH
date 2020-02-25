package padroes_de_criacao_abstract_factory;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if (color.equalsIgnoreCase("vermelho")) {
			return new Red();
		} else if (color.equalsIgnoreCase("verde")) {
			return new Green();
		} else if (color.equalsIgnoreCase("azul")) {
			return new Blue();
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
