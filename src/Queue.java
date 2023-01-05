public interface Queue<T> {
    void add(T element);
    T peek(int i);
    T poll();
    int size();
    void clear();
}
