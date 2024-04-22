package behavior.iterator;

/**
 * <big>迭代器模式</big>
 * <p>用于遍历集合中的每个元素</p>
 *
 * @author 13684
 * @data 2024/4/22 下午2:27
 */
public class IteratorApplication {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            System.out.println("Name: " + iterator.next());
        }
    }
}
