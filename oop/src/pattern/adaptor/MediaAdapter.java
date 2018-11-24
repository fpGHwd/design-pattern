/**
 * 
 */
package pattern.adaptor;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 12:20:00 PM
 */
public class MediaAdapter implements MediaPlayer {
	
	// private 
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType){
		//实现adaptor的这个因素
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer = new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer = new Mp4Player();
		}
	}

	/* (non-Javadoc)
	 * @see pattern.prototype.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer.playMp4(fileName);
		}
		
	}

}
