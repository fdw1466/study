package testSerializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.MessageFormat;

public class Serializable {

	private static void SerializePerson() throws Exception, IOException {
		Person person = new Person();
		person.setName("DWer");
		person.setAge(24);
		person.setSex("男");
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("E:/Person.txt")));
		oo.writeObject(person);
		System.out.println("Person对象序列化成功！");
		oo.close();
	}

	@SuppressWarnings({ "resource" })
	private static Person DeserializePerson() throws Exception, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:/Person.txt")));
		Person person = (Person) ois.readObject();
		System.out.println("Person对象反序列化成功！");
		return person;
	}

	public static void main(String[] args) throws Exception {
		SerializePerson();// 序列化Person对象
		Person p = DeserializePerson();// 反序列Perons对象
		System.out.println(MessageFormat.format("name={0},age={1},sex={2}", p.getName(), p.getAge(), p.getSex()));
	}
}
