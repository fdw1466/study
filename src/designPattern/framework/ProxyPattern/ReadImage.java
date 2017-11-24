package designPattern.framework.ProxyPattern;

public class ReadImage implements Image {

	private String fileName;

	public ReadImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("loading:" + fileName);
	}

	@Override
	public void display() {
		System.out.println("Displying:" + fileName);
	}

}
