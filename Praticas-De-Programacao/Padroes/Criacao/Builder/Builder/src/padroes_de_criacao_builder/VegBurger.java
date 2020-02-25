package padroes_de_criacao_builder;

public class VegBurger extends Burger {

	
	@Override
	public float price() {
		
		return 25.0f;
	}

	@Override
	public String name() {
		return "hamburguer vegetariana";
	}	
	
}
