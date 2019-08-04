package edu.princeton.cs.algorithms.queues;

import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {

    /**
     * Checks if the deque is empty.
     *
     * @return Boolean
     */
    public boolean isEmpty() {
        // YOUR CODE HERE

        return true;
    }

    /**
     * Return the number of items on the deque
     *
     * @return Integer
     */
    public int size() {
        // YOUR CODE HERE

        return 0;
    }

    /**
     * Add the item to the front
     *
     *  @param item A non null item to add.
     */
    public void addFirst(Item item) {
        // YOUR CODE HERE
    }

    /**
     * Add the item to the back
     *
     * @param item A non null item to add.
     */
    public void addLast(Item item) {
        // YOUR CODE HERE
    }


    /**
     * Remove and element from the front
     *
     * @return The item removed
     */
    public Item removeFirst() {
        // YOUR CODE HERE

        return null;
    }

    /**
     * Remove the last element
     *
     * @return The item removed
     */
    public Item removeLast() {
        // YOUR CODE HERE

        return null;
    }

    /**
     * Iterator over items in order from front to back
     *
     * @return Iterator
     */
    public Iterator<Item> iterator() {
        // YOUR CODE HERE

        return new Iterator<Item>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Item next() {
                return null;
            }
        };
    }


    // unit testing (required)
    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
