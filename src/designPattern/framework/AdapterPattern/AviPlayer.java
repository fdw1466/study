package designPattern.framework.AdapterPattern;

public class AviPlayer implements AdvancedMediaPlayer {

	@Override
	public void playMp4(String fileName) {
		System.out.println("不支持的格式");
	}

	@Override
	public void playAvi(String fileName) {
		System.out.println("Playing avi file. Name: "+ fileName);    
	}}
