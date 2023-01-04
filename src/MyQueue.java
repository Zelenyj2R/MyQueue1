import java.util.Arrays;

public class MyQueue <T> implements Queue <T> {
    private static int capacity = 10;
    private Object[] array = new Object[capacity];
    private Object[] elementsQNewAfterRemove = new Object[capacity];
    private int size;
    private void grow() {
        array = Arrays.copyOf(array, capacity *= 1.5);
    }
    public void add(Object value) {
        if (size == capacity) {
            grow();
        }
        array[size] = value;
        size++;
    }
    @Override
    public T peek(int i) {
        if (size()==0)
            return null;
        return (T) array[2];
    }
    @Override
    public T poll() {
        if (size == 0) {
            throw new RuntimeException("Nothing to pool! Queue is empty!");
        }
        var forReturn = array[0];
        array[0] = null;
        size--;
        int countNewQueue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=null) {
                elementsQNewAfterRemove[countNewQueue] = array[i];
                countNewQueue++;
            }
        }
        array = elementsQNewAfterRemove.clone();
        return (T) forReturn;
    }
    @Override
    public int size() {
        return size;
    }
    public void clear() {
        for (int i = 0; i<= size; i++)
            array[size] = null;
        size = 0;
    }

}
