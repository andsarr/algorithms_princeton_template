package edu.princeton.cs.algorithms.sliderpuzzle;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Solver {
    /**
     * Find a solution to the initial board (using the A* algorithm)
     *
     * @param initial the initial board
     */
    public Solver(Board initial) {
        // YOUR CODE HERE
    }

    /**
     * Is the initial board solvable?
     *
     * @return true if the board is solvable
     */
    public boolean isSolvable() {
        // YOUR CODE HERE

        return false;
    }

    /**
     *  Returns the min number of moves to solve initial board
     *
     * @return the min number of moves
     */
    public int moves() {
        // YOUR CODE HERE

        return 0;
    }

    /**
     * Sequence of boards in a shortest solution
     *
     * @return iterator over the solution's boards
     */
    public Iterable<Board> solution() {
        // YOUR CODE HERE

        return () -> null;
    }

    /**
     *  Test client
     *
     * @param args The user must provide the file name containing the initial bord
     */
    public static void main(String[] args) {
        // create initial board from file
        In in = new In(args[0]);
        int n = in.readInt();
        int[][] tiles = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                tiles[i][j] = in.readInt();
        Board initial = new Board(tiles);

        // solve the puzzle
        Solver solver = new Solver(initial);

        // print solution to standard output
        if (!solver.isSolvable())
            StdOut.println("No solution possible");
        else {
            StdOut.println("Minimum number of moves = " + solver.moves());
            for (Board board : solver.solution())
                StdOut.println(board);
        }
    }
}
