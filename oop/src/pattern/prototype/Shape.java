/**
 * 
 */
package pattern.prototype;

/**
 * @author Suzumiya
 * @version Nov 23, 2018 11:09:04 PM
 * /**
 * 
 */

/**
 * @author Suzumiya
 *
 */
public abstract class Shape implements Cloneable {
	private String id;
	protected String type;

	public abstract void draw();

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
