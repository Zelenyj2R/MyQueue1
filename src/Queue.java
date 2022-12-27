public interface Queue <T> {


        void add(T element);
        T get(int index);
        T peek(int i);


        T peek();

        T poll();
       T remove(int index);
        int size();
        void clear();


}
