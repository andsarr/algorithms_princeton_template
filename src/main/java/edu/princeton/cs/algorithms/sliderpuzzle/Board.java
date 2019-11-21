package edu.princeton.cs.algorithms.sliderpuzzle;

public class Board {
    /**
     * Create a board from an n-by-n array of tiles,
     *
     * @param tiles It satisfy that: tiles[row][col] = tile at (row, col)
     */
    public Board(int[][] tiles) {
        // YOUR CODE HERE
    }

    /**
     *  String representation of this board
     *
     * @return a string representation of the board.
     */
    public String toString() {
        // YOUR CODE HERE

        return "Board()";
    }

    /**
     *  Returns the dimension of the board
     *
     * @return board dimension
     */
    public int dimension() {
        // YOUR CODE HERE

        return 0;
    }

    /**
     * Number of tiles out of place
     *
     * @return tiles count
     */
    public int hamming() {
        // YOUR CODE HERE

        return 0;
    }

    /**
     * Sum of Manhattan distances between tiles and goal
     *
     * @return Manhattan distance sum
     */
    public int manhattan() {
        // YOUR CODE HERE

        return 0;
    }

    /**
     * Is this board the goal board?
     *
     * @return boolean
     */
    public boolean isGoal() {
        // YOUR CODE HERE

        return false;
    }

    /**
     * Does this board equal y?
     *
     * @param y board to compare to
     * @return true is the boards are equal
     */
    public boolean equals(Object y) {
        // YOUR CODE HERE

        return false;
    }

    /**
     *  Iterator over the neighboring boards
     *
     * @return all neighboring boards
     */
    public Iterable<Board> neighbors() {
        // YOUR CODE HERE

        return () -> null;
    }

    /**
     *  A board that is obtained by exchanging any pair of tiles
     *
     * @return Board
     */
    public Board twin() {
        // YOUR CODE HERE

        return null;
    }

}
