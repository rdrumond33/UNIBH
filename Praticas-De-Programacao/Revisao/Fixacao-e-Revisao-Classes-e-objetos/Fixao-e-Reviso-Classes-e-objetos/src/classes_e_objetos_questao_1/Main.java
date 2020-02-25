package classes_e_objetos_questao_1;

public class Main {

	public static void main(String[] args) {
		
		Empresa empresa =new Empresa();
		empresa.setNome("Unibh");
		empresa.setCNPJ("61.114.228/0001-05");
		empresa.setEndereco("Av.cristiano machao");

		Departamentos dep1 = new Departamentos();
		dep1.setEmpresa(empresa);
		dep1.setGerencia("Jennifer");
		dep1.setNome("TI");
		
		Departamentos dep2= new Departamentos();
		dep2.setEmpresa(empresa);
		dep2.setGerencia("teste");
		dep2.setNome("Administrativo");
		
		
		Funcionario func1 = new Funcionario();
		func1.admitir("Joao", "MG1111111", "19/03/2018", 1, 1700, dep1);
		Funcionario func2 = new Funcionario();
		func2.admitir("carlos", "MG155515", "19/03/2019", 2, 1850.50, dep2);
		
		System.out.println("Nome do func1: "+func1.getNome());
		System.out.println("Rg do func1: "+func1.getRG());
		System.out.println("data de admissao do func1: "+func1.getDataadmissao());
		System.out.println("nivel do func1: "+func1.getNivelCargo());
		System.out.println("salario do func1: "+func1.getSalario());
		System.out.println("departemento do func1: "+func1.getDep().getNome());
		System.out.println("Gerente do departemento do func1: "+func1.getDep().getGerencia());
		System.out.println("Nome da empresa do func1: "+func1.getDep().getEmpresa().getNome());
		System.out.println("Cnpj da empresa do func1: "+func1.getDep().getEmpresa().getCNPJ());
		System.out.println("Endereco da empresa do func1: "+func1.getDep().getEmpresa().getEndereco());

		System.out.println("\nNome do func2: "+func2.getNome());
		System.out.println("Rg do func2: "+func2.getRG());
		System.out.println("data de admissao do func2: "+func2.getDataadmissao());
		System.out.println("nivel do func2: "+func2.getNivelCargo());
		System.out.println("salario do func2: "+func2.getSalario());
		System.out.println("departemento do func2: "+func2.getDep().getNome());
		System.out.println("Gerente do departemento do func2: "+func2.getDep().getGerencia());
		System.out.println("Nome da empresa do func2: "+func2.getDep().getEmpresa().getNome());
		System.out.println("Cnpj da empresa do func2: "+func2.getDep().getEmpresa().getCNPJ());
		System.out.println("Endereco da empresa do func2: "+func2.getDep().getEmpresa().getEndereco());

		
		func1.bonificaFuncionario(1200.5);
		func1.trocaDep(dep2);
		func1.promover(5);
		
		System.out.println("\nNome do func1: "+func1.getNome());
		System.out.println("Rg do func1: "+func1.getRG());
		System.out.println("data de admissao do func1: "+func1.getDataadmissao());
		System.out.println("Novo nivel do func1: "+func1.getNivelCargo());
		System.out.println("salario+bonificacao do func1: "+func1.getSalario());
		System.out.println("salario do func1: "+func1.getSalario());
		System.out.println("Novo departemento do func1: "+func1.getDep().getNome());
		System.out.println("Nova Gerente do departemento do func1: "+func1.getDep().getGerencia());
		System.out.println("Salario anual: "+func1.calcularSalarioAnual());

		





		
		
	}

}
