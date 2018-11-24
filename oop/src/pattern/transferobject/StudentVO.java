/**
 * 
 */
package pattern.transferobject;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 12:14:12 AM
 */
public class StudentVO {
	
	private String name;
	private int rollNo;
	
	StudentVO(String name, int rollNo){
		this.setName(name);
		this.setRollNo(rollNo);
	}

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

}
