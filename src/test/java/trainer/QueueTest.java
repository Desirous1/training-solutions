package trainer;

import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {

    @Test
    public void testQueue() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        System.out.println(q);
        int i = q.element();
        System.out.println(i);
        assertEquals(1, q.element());

        i = q.remove();
        assertEquals(1, i);

        i = q.remove();
        assertEquals(2, i);

        assertEquals(0, q.size());
        assertEquals(true, q.isEmpty());

    }

    @Test
    public void testStack() { // DeQue()
        Deque<Integer> dq = new LinkedList<>();
        dq.push(1);
        dq.push(2);
        dq.push(3);

        int i = dq.peek();       //nem törli az elemet
        System.out.println(i);
        System.out.println(dq);
        assertEquals(3, i);

        i = dq.pop();
        assertEquals(3, i);
        System.out.println(dq);

        i = dq.pop();
        assertEquals(2, i);
        System.out.println(dq);

        i = dq.pop();
        assertEquals(1, i);
        System.out.println(dq);

        assertEquals(true, dq.isEmpty());
    }
}

