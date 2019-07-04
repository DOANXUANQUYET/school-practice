package k103;

public class LifoStore extends Store {

	@Override
	public Object get() {
		Object resutl = null;
		if(index >= 0 && data[index] != null) {
			resutl = data[index];
			data[index] = null;
			index--;
		}
		return resutl;
	}

}
