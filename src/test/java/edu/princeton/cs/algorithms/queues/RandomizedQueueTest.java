package edu.princeton.cs.algorithms.queues;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static edu.princeton.cs.algorithms.queues.Utils.contentAsString;
import static org.junit.jupiter.api.Assertions.*;

class RandomizedQueueTest {

    @Test
    @DisplayName("Adding a null element in the deque should thrown an exception")
    void checkAdding() {

        final RandomizedQueue<String> queue = new RandomizedQueue<>();

        assertThrows(IllegalArgumentException.class, () ->  queue.enqueue(null));
    }

    @Test
    @DisplayName("A sample or dequeue operation on an empty deque should thrown an exception")
    void checkOperationOnEmptyQueue() {
        final RandomizedQueue<String> queue = new RandomizedQueue<>();

        assertThrows(NoSuchElementException.class, queue::sample);
        assertThrows(NoSuchElementException.class, queue::dequeue);
    }

    @Test
    @DisplayName("Calling next for an iterator over an empty queue should thrown an exception.")
    void checkIteration() {
        final RandomizedQueue<String> queue = new RandomizedQueue<>();

        final Iterator<String> iterator = queue.iterator();

        assertFalse(iterator.hasNext());
        assertThrows(NoSuchElementException.class, iterator::next);
        assertThrows(UnsupportedOperationException.class, iterator::remove);
    }

    @Test
    @DisplayName("The order of two or more iterators to the same randomized queue must be mutually independent")
    void  mutuallyIndependentOrderOfIterators() {
        final RandomizedQueue<String> queue = new RandomizedQueue<>();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("D");

        final String firstPermutation = contentAsString(queue);
        final String secondPermutation = contentAsString(queue);

        assertNotEquals(firstPermutation, secondPermutation);

    }

    @Test
    @DisplayName("Enqueue and dequeue operations should resize and shrink the array properly")
    void checkQueueOps() {
        final RandomizedQueue<String> queue = new RandomizedQueue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        final String firstElement = queue.dequeue();

        // The fallowing dequeue should cause an array shrinking
        final String secondElement = queue.dequeue();

        assertNotEquals(firstElement, secondElement);
    }
}
