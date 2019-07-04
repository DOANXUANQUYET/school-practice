package k103;

public class FifoStore  extends Store{

	@Override
	public Object get() {
		Object resutl = null;
		if(data[0] != null) {
			resutl = data[0];
			for(int i = 0; i < index; i++) {
				data[i] = data[i + 1];
			}
			data[index] = null;
			index--;
		}
		return resutl;
	}

}
