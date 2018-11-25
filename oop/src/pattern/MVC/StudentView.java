/**
 * 
 */
package pattern.MVC;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 8:31:27 PM
 */
public class StudentView {
	
	//这两个类对迪米特法则的程度不一样，前者是本类对student类的内容知道得更多些，耦合多一些，因为用到了student的内部复杂度，重构比较麻烦，但是函数形式比较简单
	
	public void printStudentDetails(Student student){
	      System.out.println("Student: ");
	      System.out.println("Name: " + student.getName());
	      System.out.println("Roll No: " + student.getRollNo());
	}
	
	public void printStudentDetails(String studentName, String studentRollNo){
	      System.out.println("Student: ");
	      System.out.println("Name: " + studentName);
	      System.out.println("Roll No: " + studentRollNo);
	}
}
