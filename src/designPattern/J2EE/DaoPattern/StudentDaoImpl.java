package designPattern.J2EE.DaoPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	// 列表当做一个数据库
	List<Student> studentList;

	public StudentDaoImpl() {
		studentList = new ArrayList<>();
		studentList.add(new Student("0", "DWer"));
		studentList.add(new Student("1", "QDen"));
	}

	@Override
	public List<Student> getStuduntList() {
		return studentList;
	}

	@Override
	public Student getStudent(String rollNo) {
		return studentList.get(Integer.parseInt(rollNo));
	}

	@Override
	public void updateStudent(Student student) {
		studentList.get(Integer.parseInt(student.getRollNo())).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}

	@Override
	public void deleteStudent(Student student) {
		studentList.remove(Integer.parseInt(student.getRollNo()));
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");

	}

}
