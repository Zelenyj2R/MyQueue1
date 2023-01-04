public interface Queue<T> {
    void add(T element);
    T peek(int i);
    T poll();
    T remove(int index);
    int size();
    void clear();
}
