package padroes_de_criacao_abstract_factory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("Shape")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("Color")) {
			return new ColorFactory();

		}

		return null;

	}

}
