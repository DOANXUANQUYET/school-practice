package k104;

public class StringCharIterator implements CharIterator{

	private String data;
	private int index;
	
	
	public StringCharIterator(String data) {
		super();
		this.data = data;
	}

	@Override
	public boolean hasNext() {
		if(data.charAt(index) != '\0') {
			return true;
		}
		return false;
	}

	@Override
	public char next() {
		char result = '\0';
		if(hasNext()) {
			result = data.charAt(index);
			index++;
		}
		return result;
	}

}
