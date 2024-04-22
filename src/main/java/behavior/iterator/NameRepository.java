package behavior.iterator;

/**
 * <big>存放名称的集合</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/4/22 下午2:25
 */
public class NameRepository implements Container{
    private final String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
