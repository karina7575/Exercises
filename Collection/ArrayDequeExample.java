package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample
{
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.offerLast(8);
        System.out.println(deque);        //1,5,3,7,8
        System.out.println(deque.removeFirst());
        System.out.println("result after removeFirst: " + deque);
        System.out.println(deque.removeLast());
        System.out.println("result after removeLast: " + deque);
        System.out.println(deque.pollFirst());
        System.out.println("result after pollFirst: " + deque);
        System.out.println(deque.pollLast());
        System.out.println("result after pollLast: " + deque);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.offerLast(8);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());


    }
}
