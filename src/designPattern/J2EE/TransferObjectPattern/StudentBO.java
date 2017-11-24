package designPattern.J2EE.TransferObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {

	// 列表当成一个数据库
	List<StudentVO> students;

	public StudentBO() {
		students = new ArrayList<>();
		students.add(new StudentVO(0, "DWer"));
		students.add(new StudentVO(1, "QDen"));
	}

	public void delete(StudentVO student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}

	// 从数据库中检索学生名单
	public List<StudentVO> getAllStudents() {
		return students;
	}

	public StudentVO getStudent(int rollNo) {
		return students.get(rollNo);
	}

	public void updateStudent(StudentVO student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}
}
