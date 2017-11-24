package designPattern.framework.AdapterPattern;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}

	@Override
	public void playAvi(String fileName) {
		System.out.println("不支持的格式");
	}

}
