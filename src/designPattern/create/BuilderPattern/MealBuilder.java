package designPattern.create.BuilderPattern;

public class MealBuilder {

	public Meal perpareVerMale() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Fries());
		meal.addItem(new Cole());
		return meal;
	}

	public Meal perpareMeatMale() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new HotDog());
		meal.addItem(new Pepsi());
		return meal;
	}

}
