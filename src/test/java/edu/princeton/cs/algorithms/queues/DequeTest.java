package edu.princeton.cs.algorithms.queues;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static edu.princeton.cs.algorithms.queues.Utils.contentAsString;
import static org.junit.jupiter.api.Assertions.*;

class DequeTest {

    @Test
    @DisplayName("Removing from an empty deque should thrown an exception")
    void checkRemoving() {

        final Deque<String> deque = new Deque<>();

       assertThrows(NoSuchElementException.class, deque::removeFirst);
       assertThrows(NoSuchElementException.class, deque::removeLast);
    }

    @Test
    @DisplayName("Adding a null element in the deque should thrown an exception")
    void checkAdding() {

        final Deque<String> deque = new Deque<>();

        assertThrows(IllegalArgumentException.class, () -> deque.addFirst(null));
        assertThrows(IllegalArgumentException.class, () -> deque.addFirst(null));
    }

    @Test
    @DisplayName("Calling next for an iterator over an empty deque should thrown an exception.")
    void checkIteration() {
        final Deque<String> deque = new Deque<>();

        final Iterator<String> iterator = deque.iterator();

        assertFalse(iterator.hasNext());
        assertThrows(NoSuchElementException.class, iterator::next);
        assertThrows(UnsupportedOperationException.class, iterator::remove);
    }

    @Test
    @DisplayName("Adding in the front should work.")
    void checkAddFirst() {
        final Deque<String> deque = new Deque<>();

        deque.addFirst("A");

        assertEquals(1, deque.size());
        assertEquals("A", deque.removeLast());

        assertTrue(contentAsString(deque).isEmpty());

        deque.addFirst("A");
        deque.addFirst("B");
        deque.addFirst("C");

        assertEquals("CBA", contentAsString(deque));
    }

    @Test
    @DisplayName("Adding in the end should work.")
    void checkAddLast() {
        final Deque<String> deque = new Deque<>();

        deque.addLast("A");

        assertEquals(1, deque.size());
        assertEquals("A", deque.removeFirst());

        assertTrue(contentAsString(deque).isEmpty());

        deque.addLast("A");
        deque.addLast("B");
        deque.addLast("C");

        assertEquals("ABC", contentAsString(deque));
    }

    @Test
    @DisplayName("Removing elements from the start should work")
    void checkRemoveFirst() {
        final Deque<String> deque = new Deque<>();
        deque.addLast("A");
        deque.addLast("B");
        deque.addLast("C");
        deque.addLast("D");

        deque.removeFirst();
        deque.removeFirst();

        assertEquals("CD", contentAsString(deque));
    }

}
