package designPattern.action.MediatorPattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatRoom {

	public static void showMessage(User user, String message) {
		System.out.println(
				new SimpleDateFormat("yyyy-dd-MM HH:mm:ss").format(new Date()) + " [" + user.getName() + "] : " + message);
	}

}
