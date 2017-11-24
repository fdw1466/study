package designPattern.J2EE.InterceptingFilterPattern;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	private List<Filter> filterList = new ArrayList<>();
	private Target target;

	public void addFilter(Filter filter) {
		filterList.add(filter);
	}

	public void execute(String request) {
		for (Filter filter : filterList) {
			boolean flag = filter.execute(request);
			if (!flag) {
				System.out.println("您没有权限访问！");
				return;
			}
		}
		target.execute(request);
	}

	public void setTarget(Target target) {
		this.target = target;
	}
}
