package padroes_de_criacao_factory_method;

public class TesteDaFabrica {

	public static void main(String[] args) {

		ShapeFactory shapeFactory=new ShapeFactory();
		
		Shape shape1=shapeFactory.getShape("circulo");
		shape1.draw();
		
		Shape shape2=shapeFactory.getShape("circulo");
		shape2.draw();
		
		
		Shape shape3=shapeFactory.getShape("Retangulo");
		shape3.draw();
		
		Shape shape4=shapeFactory.getShape("Quadrado");
		shape4.draw();
		
		
		
	}

}
