/**
 * 
 */
package pattern.adaptor;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 12:18:10 PM
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	/* (non-Javadoc)
	 * @see pattern.prototype.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	/* (non-Javadoc)
	 * @see pattern.prototype.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		
	}

}
