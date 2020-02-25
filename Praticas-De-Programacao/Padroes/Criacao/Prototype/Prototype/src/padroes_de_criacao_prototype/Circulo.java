package padroes_de_criacao_prototype;

public class Circulo extends Shape {
	
	public Circulo(){
		type="circulo";
	}

	@Override
	void draw() {
		System.out.println("Desenho Circulo");
		
	}

}
