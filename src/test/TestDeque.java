
package test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Roberto Olveras
 */
public class TestDeque {
    public static void main(String[] args) {
        Deque deck = new ArrayDeque();
        deck.add("uno");
        deck.add("dos");
        deck.add("tres");
        System.out.println("----FIFO------");
        System.out.println(deck);
        
        System.out.println(deck.remove());
        System.out.println(deck);
        
        System.out.println(deck.remove());
        System.out.println(deck);
        
        System.out.println(deck.remove());
        System.out.println(deck);
        
        System.out.println("------LIFO-------");
        deck.push("uno");
        deck.push("dos");
        deck.push("tres");
        
        System.out.println(deck);
        System.out.println("------pollLast--------");
        System.out.println(deck.pollLast());
        System.out.println(deck);
        
        System.out.println("-----peek-----");
        System.out.println(deck.peek());
        System.out.println(deck);
        
        System.out.println(deck.pop());
        System.out.println(deck);
        
        System.out.println(deck.pop());
        System.out.println(deck);
    }
}
