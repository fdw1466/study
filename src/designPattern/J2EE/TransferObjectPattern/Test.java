package designPattern.J2EE.TransferObjectPattern;

/**
 * 传输对象模式（J2EE）
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		StudentBO studentBusinessObject = new StudentBO();

		// 输出所有的学生
		for (StudentVO student : studentBusinessObject.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}

		// 更新学生
		StudentVO student = studentBusinessObject.getAllStudents().get(1);
		student.setName("wife");
		studentBusinessObject.updateStudent(student);

		// 获取学生
		studentBusinessObject.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}
}
