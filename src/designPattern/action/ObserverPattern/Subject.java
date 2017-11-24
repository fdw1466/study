package designPattern.action.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observerList = new ArrayList<>();

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObserver();
	}

	public void attach(Observer observer) {
		observerList.add(observer);
	}

	private void notifyAllObserver() {
		for (Observer observer : observerList) {
			observer.update();
		}
	}

}
