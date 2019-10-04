public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] socks = {"LAAaaAAAAAAAAAA", "RAAaaAAAAAAAAAA", "RAAaaAAAAAAAAAA","RAAaaAAAAAAAAAA","RAAaaAAAAAAAAAA"};
		System.out.println("-------->  ");
		System.out.println(smallerNumber(socks));
	}

	static int smallerNumber(String[] socks) {
		int result = 0;
		for(int i = 0; i < socks.length - 1; i++) {
			if(socks[i] ==  null) continue;
			for(int j = i + 1; j < socks.length; j++) {
				if(socks[j] == null) continue;
				if(socks[i].charAt(0) != socks[j].charAt(0) && socks[j].charAt(1) == socks[i].charAt(1) && socks[j].length() == socks[i].length()) {
					result++;
					socks[j] = null;
				}
			}
		}
		return result;
	}
}
