import java.util.LinkedList;
import java.util.List;

import javax.lang.model.element.Element;
import javax.xml.transform.Source;

/*
 *  Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
 first() - возвращает первый элемент из очереди, не удаляя.
 */


public class task2 {
    public static LinkedList<Integer> list = new LinkedList<Integer> ();

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);

        System.out.println(size());
        System.out.println(isEmpty());

        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
    }

    public static void enqueue (int element) {
        list.addLast(element);
    }

    public static int dequeue () {
        return list.removeFirst();
    }
    
    public static int first() {
        return list.getFirst();
    } 

    public static int size() {
        return list.size();
    }

    public static boolean isEmpty() {
        return list.isEmpty();
    }
}
