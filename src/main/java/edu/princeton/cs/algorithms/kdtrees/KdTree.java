package edu.princeton.cs.algorithms.kdtrees;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;

public class KdTree {

    /**
     * Construct an empty set of points
     */
    public KdTree() {
    }

    /**
     * Returns <tt>true</tt> if this set contains no point.
     *
     * @return |true| if this set contains no point.
     */
    public boolean isEmpty() {
        // YOUR CODE HERE
        return false;
    }

    /**
     * Returns the number of points in the set
     *
     * @return number of points in the set
     */
    public int size() {
        // YOUR CODE HERE
        return 0;
    }

    /**
     * Add the point to the set (if it is not already in the set)
     *
     * @param p point to be added
     * @throws IllegalArgumentException if the specified point is null
     */
    public void insert(Point2D p) {
        // YOUR CODE HERE
    }

    /**
     * Returns <tt>true</tt> if this set contains the specified point.
     *
     * @param p point whose presence in this list is to be tested
     * @return <tt>true</tt> if this set contains the specified point
     * @throws IllegalArgumentException if the specified point is null
     */
    public boolean contains(Point2D p) {
        // YOUR CODE HERE
        return false;
    }

    /**
     * Draw all points to standard draw
     */
    public void draw() {
        // YOUR CODE HERE
    }

    /**
     * Returns an iterable with all points that are inside the rectangle (or on the boundary)
     *
     * @param rect rectangle to check
     * @return all points that are inside the rectangle (or on the boundary)
     * @throws IllegalArgumentException if the specified rectangle is null
     */
    public Iterable<Point2D> range(RectHV rect) {
        // YOUR CODE HERE
        return null;
    }

    /**
     * Returns the nearest neighbor in the set to point p
     *
     * @param p point whose nearest neighbor want to be determined
     * @return the nearest neighbor in the set to point p or |null| if  the set is empty
     * @throws IllegalArgumentException if the specified point is null
     */
    public Point2D nearest(Point2D p) {
        // YOUR CODE HERE
        return null;
    }

}
