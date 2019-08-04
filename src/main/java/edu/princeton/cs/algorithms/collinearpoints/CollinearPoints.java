package edu.princeton.cs.algorithms.collinearpoints;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class CollinearPoints {
    /**
     *    This client program takes the name of an input file as a command-line argument;
     *  read the input file (in the format specified below); prints to standard output the
     *  line segments that your program discovers, one per line; and draws to standard draw
     *  the line segments.
     *
     * @param args It must contain the variant name and the file name as parameters
     */
    public static void main(String[] args) {

        if (args.length < 2) {
            throw new IllegalArgumentException("There are no enough parameters");
        }

        final String method = args[0];

        // read the n points from a file
        In in = new In(args[1]);
        int n = in.readInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = in.readInt();
            int y = in.readInt();
            points[i] = new Point(x, y);
        }

        // draw the points
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setPenRadius(0.01);
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);
        for (Point p : points) {
            p.draw();
        }
        StdDraw.show();

        LineSegment[] segments;
        // print and draw the line segments
        if (method.equalsIgnoreCase("fast")) {
            FastCollinearPoints collinear = new FastCollinearPoints(points);
            segments = collinear.segments();
        }  else {
            BruteCollinearPoints collinear = new BruteCollinearPoints(points);
            segments = collinear.segments();
        }

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setPenRadius(0.005);
        for (LineSegment segment : segments) {
            StdOut.println(segment);
            segment.draw();
        }
        StdDraw.show();
    }

}
