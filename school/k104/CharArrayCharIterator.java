package k104;

public class CharArrayCharIterator implements CharIterator{
	
	private char[][] data;
	private int index1;
	private int index2;
	
	

	public CharArrayCharIterator(char[][] data) {
		super();
		this.data = data;
	}

	@Override
	public boolean hasNext() {
		if(index1 >= data.length)
		if(data[index1][index2] != '\0') {
			return true;
		}
		return false;
	}

	@Override
	public char next() {
		char result = '\0';
		if(hasNext()) {
			result = data[index1][index2];
			index2++;
		}
		else {
			index1++;
			index2 = 0;
		}
		return result;
	}

}
