package padroes_de_criacao_prototype;

public class Quadrado extends Shape  {

	public Quadrado(){
		type="Quadrado";
	}

	@Override
	void draw() {
		System.out.println("Desenho Quadrado");
		
	}
	
}
