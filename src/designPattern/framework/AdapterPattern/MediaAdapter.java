package designPattern.framework.AdapterPattern;

public class MediaAdapter implements MedioPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new Mp4Player();
		} else if (audioType.equalsIgnoreCase("avi")) {
			advancedMediaPlayer = new AviPlayer();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playMp4(fileName);
		} else if (audioType.equalsIgnoreCase("avi")) {
			advancedMediaPlayer.playAvi(fileName);
		}
	}

}
