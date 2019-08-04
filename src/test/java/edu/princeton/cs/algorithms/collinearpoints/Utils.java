package edu.princeton.cs.algorithms.collinearpoints;

import edu.princeton.cs.algs4.In;

class Utils {
    private Utils() {
        throw new java.lang.UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static Point[] pointsForFile(final String file) {
        In in = new In(file);
        int n = in.readInt();

        Point[] points = new Point[n];

        for (int i = 0; i < n; i++) {
            int x = in.readInt();
            int y = in.readInt();
            points[i] = new Point(x, y);
        }

        return points;
    }
}
