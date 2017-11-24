package designPattern.J2EE.ServiceLocatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Cache {

	private List<Service> serviceList;

	public Cache() {
		serviceList = new ArrayList<>();
	}

	public Service getService(String serviceName) {
		for (Service service : serviceList) {
			if (service.getName().equals(serviceName)) {
				System.out.println("Returning cached  " + serviceName + " object");
				return service;
			}
		}
		return null;
	}

	public void addService(Service newService) {
		boolean exists = false;
		for (Service service : serviceList) {
			if (service.getName().equals(newService.getName())) {
				exists = true;
			}
		}
		if (!exists)
			serviceList.add(newService);
	}
}
