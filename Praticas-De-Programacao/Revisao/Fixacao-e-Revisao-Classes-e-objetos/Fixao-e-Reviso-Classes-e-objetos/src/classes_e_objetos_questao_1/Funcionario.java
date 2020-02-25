package classes_e_objetos_questao_1;

public class Funcionario {

	private Departamentos Dep;
	private int nivelCargo;
	private double salario;
	private String nome,Dataadmissao, RG;

	/* um m�todo que permita admitir um funcion�rio. */
	public void admitir(String nome,String RG,String dataadmissao,int nivelCargo,double salario,Departamentos dep) {
		setNome(nome);
		setDataadmissao(dataadmissao);
		setDep(dep);
		setNivelCargo(nivelCargo);
		setRG(RG);
		setSalario(salario);
	}

	/* um m�todo que permita bonificar o funcion�rio, aumentando seu sal�rio. */
	public void bonificaFuncionario(Double bonificacao) {
		setSalario(salario + bonificacao);
	}

	/* um m�todo que permita trocar o departamento do funcion�rio. */
	public void trocaDep(Departamentos Novo_dep) {

		setDep(Novo_dep);

	}

	// um m�todo que permita promover o funcion�rio, elevando o n�vel do seu cargo.
	public void promover(int nivel) {
		setNivelCargo(nivel);

	}

	/*
	 * um m�todo que permita calcular o valor do sal�rio anual do funcion�rio,
	 * calculandoo valor do sal�rio multiplicado por 12.
	 */

	public String calcularSalarioAnual() {

		return String.valueOf((getSalario() * 12));
	}

	public Departamentos getDep() {
		return Dep;
	}

	public void setDep(Departamentos dep) {
		Dep = dep;
	}

	public int getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(int nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataadmissao() {
		return Dataadmissao;
	}

	public void setDataadmissao(String dataadmissao) {
		Dataadmissao = dataadmissao;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
