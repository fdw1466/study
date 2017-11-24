package designPattern.framework.FilterPattern;

import java.util.List;

public class CriteriaAnd implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;

	public CriteriaAnd(Criteria criteria, Criteria otherCriertia) {
		this.criteria = criteria;
		this.otherCriteria = otherCriertia;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
