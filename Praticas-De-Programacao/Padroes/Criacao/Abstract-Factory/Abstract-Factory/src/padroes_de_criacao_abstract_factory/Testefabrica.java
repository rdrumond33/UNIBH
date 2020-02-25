package padroes_de_criacao_abstract_factory;

public class Testefabrica {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape Shape1 = shapeFactory.getShape("quadrado");

		Shape Shape2 = shapeFactory.getShape("circulo");

		Shape Shape3 = shapeFactory.getShape("retangulo");

		AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
		Color cor1 = colorFactory.getColor("azul");
		Shape1.draw();
		cor1.fill();

		Color cor2 = colorFactory.getColor("vermelho");
		Shape2.draw();
		cor2.fill();
		
		Color cor3 = colorFactory.getColor("verde");
		Shape3.draw();
		cor3.fill();

	}

}
