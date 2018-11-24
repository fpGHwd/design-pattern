package pattern.dataaccessobject;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 9:18:08 PM
 * 
 */

public class Student {
	
	private String name;
	private int rollNo;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}

	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Student(String name, int rollNum) {
		this.name = name;
		this.rollNo = rollNum;
	}

}
