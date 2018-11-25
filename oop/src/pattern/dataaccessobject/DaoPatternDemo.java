package pattern.dataaccessobject;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 9:27:51 PM
 * 
 */

public class DaoPatternDemo {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();

		// 输出所有的学生
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}

		// 更新学生
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);

		// 获取学生
		studentDao.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}

}

// 一言不合全都讲到web了，刚好，web就是需要设计模式啊，刚好解决自己的问题
