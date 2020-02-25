package padroes_de_criacao_builder;

public class Teste {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg meal");
		vegMeal.showItems();
		System.out.println("total cost : "+ vegMeal.getCost());
		

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nnon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("total cost : "+nonVegMeal.getCost());
		
	}

}
