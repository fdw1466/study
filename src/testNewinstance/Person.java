package testNewinstance;

public class Person implements Skill {

	private String id;

	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println(this.getName() + "在吃饭");
	}

	@Override
	public void sleep() {
		System.out.println(this.getName() + "在睡觉");
	}

}
