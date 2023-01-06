public interface Queue<T> {
    void add(T element);
    T peek();
    T poll();
    int size();
    void clear();
}
