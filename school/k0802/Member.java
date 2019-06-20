package k0802;

public class Member extends User {
	
	private int point;
	
	

	public int getPoint() {
		return point;
	}



	public Member(String name, int point) {
		super(name);
		this.point = point;
	}



	public Member(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public int addPoint(int point) {
		return this.point += point;
	}
	
	public int userPoint(int point) {
		if(this.point >= point) {
			return this.point -= point;
		}
		return -1;
	}
	
	
	

}
