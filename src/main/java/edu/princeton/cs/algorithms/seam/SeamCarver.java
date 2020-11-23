package edu.princeton.cs.algorithms.seam;

import edu.princeton.cs.algs4.Picture;

public class SeamCarver {

    /**
     *  Creates a seam carver object based on the given picture.
     *  The input picture is not mutated by this object.
     *
     * @throws IllegalArgumentException if picture is null.
     */
    public SeamCarver(Picture picture) {

    }

    /**
     * Returns the current picture.
      */
    public Picture picture() {
        return null;
    }

    /**
     * Returns the width of current picture.
     */
    public int width() {
        return 0;
    }

    /**
     * Returns the height of current picture.
     */
    public int height() {
        return 0;
    }

    /**
     * Returns the energy of pixel at column x and row y.
     *
     * @throws IllegalArgumentException if coordinates are outside current picture boundaries.
     */
    public double energy(int x, int y) {
        return 0;
    }

    /**
     * Returns the sequence of indices for horizontal seam.
     */
    public int[] findHorizontalSeam() {
        return null;
    }

    /**
     * Returns the sequence of indices for vertical seam.
     */
    public int[] findVerticalSeam() {
        return null;
    }

    /**
     * Removes horizontal seam from current picture.
     *
     * @throws IllegalArgumentException in any of the following situations:
     *  - the height of the picture is less than or equal to 1
     *  - the input array is null or has the wrong length
     *  - the input array is not a valid seam, i.e. either an entry is outside its prescribed range
     *    or two adjacent entries differ by more than 1.
     */
    public void removeHorizontalSeam(int[] seam) {
    }

    /**
     * Removes vertical seam from current picture.
     *
     * @throws IllegalArgumentException in any of the following situations:
     *  - the width of the picture is less than or equal to 1
     *  - the input array is null or has the wrong length
     *  - the input array is not a valid seam, i.e. either an entry is outside its prescribed range
     *    or two adjacent entries differ by more than 1.
     */
    public void removeVerticalSeam(int[] seam) {
    }

    //  unit testing (optional)
    public static void main(String[] args) {
    }

}