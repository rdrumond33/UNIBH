package lista_8_Iterator;

public class Main {

	public static void main(String[] args) {

		NameRepository namesRepository = new NameRepository();
		CpfRepository cpfRepository = new CpfRepository();
		IdadeRepository idadeRepository = new IdadeRepository();
		Iterator iter1 = cpfRepository.getIterator();
		Iterator iter2 = idadeRepository.getIterator();
		
		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			
			String name = (String)iter.next();
			String cpf = (String)iter1.next();
			String idade = (String)iter2.next();
				
			
				
				System.out.println("Nome"+name+ " Cpf: "+  cpf + " idade: " +idade );
			}
		}
	}


