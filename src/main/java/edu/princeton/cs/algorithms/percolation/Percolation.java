package edu.princeton.cs.algorithms.percolation;

public class Percolation {

    /**
     *  Create n-by-n grid, with all sites blocked
     *
     * @param n Amount of elements in the "system"
     */
    public Percolation(int n) {
        // YOUR CODE HERE
    }

    /**
     * Open a site if it is not open already
     *
     * @param row The row of the element in the grid
     * @param col The column of the element in the grid
     */
    public void open(int row, int col) {
        // YOUR CODE HERE
    }

    /**
     * Is the site?
     *
     * @param row The row of the element in the grid
     * @param col The column of the element in the grid
     * @return A boolean indicating the current status of the site
     */
    public boolean isOpen(int row, int col) {
        // YOUR CODE HERE

        return false;
    }

    /**
     *  A site is full if it is connected to the top. This function checks whether the site is open or not.
     *
     * @param row The row of the element in the grid
     * @param col The column of the element in the grid
     * @return A boolean indicating if the site is full
     */
    public boolean isFull(int row, int col) {
        // YOUR CODE HERE

        return false;
    }

    /**
     *  Returns the number of open sites
     * @return Integer
     */
    public int numberOfOpenSites() {
        // YOUR CODE HERE

        return 0;
    }

    /**
     *  This function answer to the question: Does the system percolate?
     *
     * @return Boolean
     */
    public boolean percolates() {
        // YOUR CODE HERE

        return false;
    }
}
