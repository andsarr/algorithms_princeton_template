package edu.princeton.cs.algorithms.queues;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {

    /**
     * Construct an empty randomized queue
     */
    public RandomizedQueue() {
        // YOUR CODE HERE
    }

    /**
     * Checks if the queue is empty.
     *
     * @return Boolean
     */
    public boolean isEmpty() {
        // YOUR CODE HERE

        return false;
    }

    /**
     * Return the number of items on the queue
     *
     * @return Integer
     */
    public int size() {
        // YOUR CODE HERE

        return 0;
    }

    /**
     *  Add an item
     *
     * @param item A non null item to add.
     */
    public void enqueue(Item item) {
        // YOUR CODE HERE
    }

    /**
     * Remove and return a random item
     *
     * @return Item
     */
    public Item dequeue() {
        // YOUR CODE HERE

        return null;
    }

    /**
     * Return a random item (but do not remove it)
     *
     * @return Item
     */
    public Item sample() {
        // YOUR CODE HERE

        return null;
    }


    /**
     * Return an independent iterator over items in random order
     *
     * @return Iterator
     */
    public Iterator<Item> iterator() {
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
