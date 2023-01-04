public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue();
        myQueue.add("Mercury");
        myQueue.add("Venus");
        myQueue.add("Earth");
        System.out.println("myQueue " + myQueue.size());
        System.out.println("myQueue " + myQueue.peek(1));
        System.out.println(myQueue.poll());
        myQueue.clear();
        System.out.println("myQueue " + myQueue.size());
        myQueue.add("Mercury");
        myQueue.add("Venus");
        myQueue.add("Earth");
        System.out.println("myQueue " + myQueue.size());

    }
}
