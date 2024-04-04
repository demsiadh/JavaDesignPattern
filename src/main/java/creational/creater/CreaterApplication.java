package creational.creater;

/**
 * <big>建造者模式</big>
 * <p>使用多个简单的对象一步一步构建成一个复杂的对象</p>
 * <p>优点</p>
 * <li>分离构建过程和表示，使得构建过程更加灵活，可以构建不同的表示</li>
 * <li>可以更好地控制构建过程，隐藏具体构建细节。</li>
 * <li>代码复用性高，可以在不同的构建过程中重复使用相同的建造者。</li>
 * <p>缺点</p>
 * <li>如果产品的属性较少，建造者模式可能会导致代码冗余。</li>
 * <li>建造者模式增加了系统的类和对象数量。</li>
 *
 *
 * @author 13684
 * @date 2024/4/4
 */
public class CreaterApplication {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();

        System.out.println("-----------------------------");

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
    }
}
