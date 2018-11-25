/**
 * 
 */
package pattern.adaptor;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 12:18:44 PM
 */
public class Mp4Player implements AdvancedMediaPlayer {

	/* (non-Javadoc)
	 * @see pattern.prototype.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {
		// 不会所以只是说一下什么也不做
		
	}

	/* (non-Javadoc)
	 * @see pattern.prototype.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}


}
