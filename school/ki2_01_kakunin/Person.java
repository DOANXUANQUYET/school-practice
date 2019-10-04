package ki2_01_kakunin;

public class Person {

	private String name;
	private String type;

	public Person(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		boolean ret = false;
		if (obj instanceof Person) {
			Person person = (Person) obj;
			if (name.equals(person.name) && type.equals(person.type)) {
				ret = true;
			}
		}
		return ret;
	}

	@Override
	public String toString() {
		return String.format("Name=%s, Type=%s", name, type);
	}

}
