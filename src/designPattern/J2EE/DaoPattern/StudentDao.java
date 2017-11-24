package designPattern.J2EE.DaoPattern;

import java.util.List;

public interface StudentDao {
	List<Student> getStuduntList();

	Student getStudent(String rollNo);

	void updateStudent(Student student);

	void deleteStudent(Student student);
}
