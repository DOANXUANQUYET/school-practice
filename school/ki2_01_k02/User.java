package ki2_01_k02;

public class User {
	private static int baseNo = 1;
	private int no;
	private String name;
	
	public User(String name) {
		super();
		this.no = User.baseNo;
		this.name = name;
		User.baseNo ++;
	}


	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}
	
}
