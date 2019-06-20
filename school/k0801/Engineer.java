package k0801;

public class Engineer extends Employee {
	
	public Engineer(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	private String projectName;

	public Engineer(String id, String name, String projectName) {
		super(id, name);
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	

}
