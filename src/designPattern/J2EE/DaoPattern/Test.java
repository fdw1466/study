package designPattern.J2EE.DaoPattern;

import java.lang.reflect.Field;

/**
 * 数据访问模式（J2EE模式）
 * 
 * @author Administrator
 *
 */
public class Test {

	@DWer("studentDao")
	public static StudentDao studentDao;

	@SuppressWarnings("static-access")
	public static void getStudentDao(Class<?> clazz) {
		try {
			Class<?> c = Class.forName(clazz.getName());
			Field[] fields = c.getDeclaredFields();
			for (Field field : fields) {
				if (field.isAnnotationPresent(DWer.class)) {
					Test t = (Test) Class.forName(clazz.getName()).newInstance();
					t.studentDao = new StudentDaoImpl();
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getStudentDao(Test.class);

		// 输出所有学生信息
		for (Student student : studentDao.getStuduntList()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}

		// 更新学生
		Student student = studentDao.getStuduntList().get(1);
		student.setName("wife");
		studentDao.updateStudent(student);

		// 获取学生
		student = studentDao.getStudent("1");
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");

		// 删除学生
		studentDao.deleteStudent(student);
	}
}
