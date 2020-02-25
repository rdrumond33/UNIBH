package questao_1;

import java.util.*;

public class Empregado {

	private String nome;
	private String dept;
	private int salario;
	private List<Empregado> subordinado;
	
	

	
	
	
	public Empregado(String nome, String dept, int salario) {
		super();
		this.nome = nome;
		this.dept = dept;
		this.salario = salario;
		subordinado = new ArrayList<Empregado>();
	}
	
	
	public void add(Empregado e) {
		
		subordinado.add(e);
		
	}
	
	public void remove(Empregado e) {
		subordinado.remove(e);
	}
	
	public List<Empregado> getSubordinado(){
		return subordinado;
	}
	
	public String toString() {
		return ("Empregado [ nome: "+this.nome+" Departamento: "+this.dept+" Salaraio: "+ this.salario);
	}
	
}
