package lista_8_Iterator;


public class IdadeRepository implements Container {
	
	public String Idades[] = {"15","12","22","50"};

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new IdadeIterator();
	}
	
	
	private class IdadeIterator implements Iterator{
	
		int index ; 
		
		@Override
		public boolean hasNext() {
			
			if (index< Idades.length) {
				return true;
			}
			
			return false;
		}

		@Override	
		public Object next() {
			if (this.hasNext()) {
				return Idades[index++ ];
			}	
			
			return null;
		}
			
		
	}

	
	
	
}


