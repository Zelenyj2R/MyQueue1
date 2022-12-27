public class MyQueue <T> implements Queue <T> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;


    @Override
    public void add(T element) {
        array[pointer] = element;
        System.out.println(pointer+"  "+array[pointer]);pointer++;
    }


    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public T peek(int i) {
        if (size()==0)
            return null;
        return (T) array[0];
    }


    @Override
    public T remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2); // если элементов в CUT_RATE раз меньше чем
        // длина массива, то уменьшу в два раза
        return null;
    }

    @Override
    public int size() {
        return pointer;
    }

    //повертає перший елемент з черги
    @Override
    public T peek(){
        if (size()==0)
            return null;//System.exit(-1);
        return (T) array[0];
    }
    // повертає перший елемент з черги і видаляє його з колекції
    public T poll(){
        if (size()==0)
            return null;
        T element = (T) array[1];
        remove(0);
        return element;
    }
    /*Вспомогательный метод для масштабирования.*/
    @Override
    public void clear() {
        for (int i = 0; i<=pointer; i++)
            array[pointer] = null;
        pointer = 0;
    }
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
