package creational.creater;

/**
 * <big>套餐构建类</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class MealBuilder {
    public Meal prepareVegMeal()
    {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal()
    {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
