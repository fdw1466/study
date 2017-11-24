package designPattern.framework.AdapterPattern;

/**
 * 适配器模式（结构型模式）
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "only you.mp3");
		audioPlayer.play("mp4", "大话西游.mp4");
		audioPlayer.play("avi", "四不撒呐.avi");
		audioPlayer.play("mp5", "不存在的.mp5");
	}

}
