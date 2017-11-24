package designPattern.J2EE.MVCPattern;

/**
 * MVC模式（J2EE 模式）
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		// 从数据库获取学生记录
		Student model = retriveStudentFromDatabase();

		// 创建一个视图，把学生信息输出到控制台
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);
		controller.updateView();
	}

	private static Student retriveStudentFromDatabase() {
		return new Student("666", "DWer");
	}

}
