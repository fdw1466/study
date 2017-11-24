package designPattern.create.BuilderPattern;

/**
 * 建造者模式（创建型模式）
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.perpareVerMale();
		System.out.println("=========Veg Meal========");
		vegMeal.showItem();
		System.out.println("Total cost:" + vegMeal.getCost());

		Meal meatMeal = mealBuilder.perpareMeatMale();
		System.out.println("\n=========Meat Meal=========");
		meatMeal.showItem();
		System.out.println("Total cost:" + meatMeal.getCost());
	}

}
