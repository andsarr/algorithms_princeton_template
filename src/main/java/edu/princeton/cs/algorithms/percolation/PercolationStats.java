package edu.princeton.cs.algorithms.percolation;

public class PercolationStats {


    /**
     * Perform trials independent experiments on an n-by-n grid
     *
     * @param n Size of the grid
     * @param trials Number of experiments to perform
     */
    public PercolationStats(int n, int trials) {
        // YOUR CODE HERE
    }

    public static void main(String[] args) {

        if (args.length < 2) {
            throw new IllegalArgumentException("Not enough arguments given");
        }

        final int n = Integer.parseInt(args[0]);
        final int trials = Integer.parseInt(args[1]);

        if ((n <= 0) || (trials <= 0)) {
            throw new IllegalArgumentException("Illegal values for n or trials.");
        }

        final PercolationStats percolationStats = new PercolationStats(n, trials);

        System.out.printf("mean                    = %f%n", percolationStats.mean());
        System.out.printf("stddev                  = %f%n", percolationStats.stddev());
        System.out.printf("95%% confidence interval = [%f, %f]%n", percolationStats.confidenceLo(), percolationStats.confidenceHi());

    }

    /**
     * Sample mean of percolation threshold
     *
     * @return Double
     */
    public double mean() {
        // YOUR CODE HERE

        return 0.0;
    }

    /**
     * Sample standard deviation of percolation threshold
     *
     * @return Double
     */
    public double stddev() {
        // YOUR CODE HERE

        return 0.0;
    }

    /**
     * Low  endpoint of 95% confidence interval
     *
     * @return Double
     */
    public double confidenceLo() {
        // YOUR CODE HERE

        return 0.0;
    }

    /**
     * High endpoint of 95% confidence interval
     *
     * @return Double
     */
    public double confidenceHi() {
        // YOUR CODE HERE

        return 0.0;
    }
}
