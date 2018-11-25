package pattern.dataaccessobject;

import java.util.List;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 9:21:10 PM
 * 
 */

public interface StudentDao {
	public List<Student> getAllStudents();
	public Student getStudent(int rollNo);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
	public void addStudent(Student student);	
}
