package k103;

abstract public class Store {
	
	protected Object[] data = new Object[6];
	protected int index = -1;
	
	public void put(Object value) {
		
		if(size() < 5){
			index++;
			data[index] = value;			
		}else {
			System.out.println("Overflow");
		}
	}
	
	
	// kiem tra xem co bao nhieu phan tu khac null
	public int size() {
		int size = 0;
		int i = 0;
		while(data[i] != null) {
			size++;
			i++;
		}
		return size;
	}
	
	abstract public Object get();

}
