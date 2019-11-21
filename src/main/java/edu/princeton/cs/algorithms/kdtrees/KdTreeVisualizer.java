package edu.princeton.cs.algorithms.kdtrees;

/******************************************************************************
 *  Compilation:  javac KdTreeVisualizer.java
 *  Execution:    java KdTreeVisualizer
 *  Dependencies: KdTree.java
 *
 *  Add the points that the user clicks in the standard draw window
 *  to a kd-tree and draw the resulting kd-tree.
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;

public class KdTreeVisualizer {

    public static void main(String[] args) {
        String filename = args[0];
        In in = new In(filename);
        KdTree kdtree = new KdTree();

        double max = 1.3;
        double min = -0.3;
        StdDraw.setScale(min, max);

        // x axis
        StdDraw.line(min, 0, max, 0);
        StdDraw.text(-0.05, 1.2, "y");

        // y axis
        StdDraw.line(0, min, 0, max);
        StdDraw.text(1.2, -0.05, "x");

        // Origin
        StdDraw.text(-0.13, -0.05, "(0.0, 0.0)");

        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(1, 0, 1, 1);
        StdDraw.line(0, 1, 1, 1);

        while (!in.isEmpty()) {
            double x = in.readDouble();
            double y = in.readDouble();
            Point2D p = new Point2D(x, y);
            kdtree.insert(p);
        }

        kdtree.draw();
    }
}
