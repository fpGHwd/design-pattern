/**
 * 
 */
package pattern.MVC;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 8:36:45 PM
 */
public class MVCPatternDemo {
	public static void main(String[] args) {

		// 从数据库获取学生记录
		Student model = retriveStudentFromDatabase();

		// 创建一个视图：把学生详细信息输出到控制台
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView(); // 相当于浏览器获得响应的操作(response)

		// 更新模型数据
		controller.setStudentName("John"); // 相当于浏览器请求服务器的操作(request)

		controller.updateView();
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}
