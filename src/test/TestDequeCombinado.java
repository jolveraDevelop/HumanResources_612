
package test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Roberto Olveras
 */
public class TestDequeCombinado {
    public static void main(String[] args) {
        Deque deck = new ArrayDeque();
        deck.push("uno");
        deck.push("dos");
        deck.push("tres");
        
        System.out.println(deck);
        System.out.println(deck.remove());
        System.out.println(deck);
        
        System.out.println(deck.remove());
        System.out.println(deck);
        
    }
}
