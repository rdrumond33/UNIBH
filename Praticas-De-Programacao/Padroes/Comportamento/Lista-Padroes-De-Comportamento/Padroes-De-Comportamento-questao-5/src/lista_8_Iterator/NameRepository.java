package lista_8_Iterator;

public class NameRepository implements Container{
	public String nomes[] = {"Robero","Rodrigo","Juliene","Lora"};

	
	
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
	
	
	private class NameIterator implements Iterator{
	
		int index ; 
		
		@Override
		public boolean hasNext() {
			
			if (index< nomes.length) {
				return true;
			}
			
			return false;
		}

		@Override	
		public Object next() {
			if (this.hasNext()) {
				return nomes[index++ ];
			}	
			
			return null;
		}
			
		
	}

	
	
	
}

