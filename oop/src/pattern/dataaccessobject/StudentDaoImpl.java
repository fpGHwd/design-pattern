package pattern.dataaccessobject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 9:23:01 PM
 * 
 */

public class StudentDaoImpl implements StudentDao {

	private List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("Robert", 0);
		Student student2 = new Student("John", 1);
		students.add(student1);
		students.add(student2);
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public void updateStudent(Student student) {
	      students.get(student.getRollNo()).setName(student.getName());
	      System.out.println("Student: Roll No " + student.getRollNo() 
	         +", updated in the database");
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}

	@Override
	public void addStudent(Student student) {

	}

	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo); // get index
	}

}
