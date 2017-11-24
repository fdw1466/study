package testNewinstance;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {
		Class<?> c = Class.forName(Person.class.getName());
		Person p = (Person) c.newInstance();
		Field f = c.getDeclaredField("name");
		f.setAccessible(true);
		f.set(p, "DWer");
		p.eat();
	}

}