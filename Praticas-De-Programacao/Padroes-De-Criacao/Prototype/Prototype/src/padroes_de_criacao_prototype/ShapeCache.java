package padroes_de_criacao_prototype;

import java.util.Hashtable;

public class ShapeCache {
	
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String,Shape>();
	
	public static Shape getShape(String shapeId) {
		
		Shape cachedShape =shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
		
	}
	
	public static void loadCache() {
		Circulo circulo= new Circulo();
		circulo.setId("1");
		shapeMap.put(circulo.getId(),circulo);
		
		Quadrado quadrado = new Quadrado();
		quadrado.setId("2");
		shapeMap.put(quadrado.getId(),quadrado);
		
		Retangulo retangulo= new Retangulo();
		retangulo.setId("3");
		shapeMap.put(retangulo.getId(),retangulo);
		
		
		
	}

}
