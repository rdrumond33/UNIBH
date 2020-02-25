package lista_8_Iterator;


public class CpfRepository implements Container {

	public String Cpfs[] = {"555545454-5","555441-15","00205555-5","00202202-5"};

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new CpfIterator();
	}
	
	
	private class CpfIterator implements Iterator{
	
		int index ; 
		
		@Override
		public boolean hasNext() {
			
			if (index< Cpfs.length) {
				return true;
			}
			
			return false;
		}

		@Override	
		public Object next() {
			if (this.hasNext()) {
				return Cpfs[index++ ];
			}	
			
			return null;
		}
			
		
	}

	
	
	
}

