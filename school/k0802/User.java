package k0802;

public class User {
	
	static private int seqNo = 1001;
	
	private int no;
	private String name;
	
	public User(String name) {
		this.no = User.seqNo;
		this.name = name;
		User.seqNo ++;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}
		

}
