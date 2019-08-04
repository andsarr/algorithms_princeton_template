package edu.princeton.cs.algorithms.collinearpoints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static edu.princeton.cs.algorithms.collinearpoints.Utils.pointsForFile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import edu.princeton.cs.algs4.StdOut;

class FastCollinearPointsTest {
    @ParameterizedTest(name = "The amount of segments detected for the file {0} should be {1}")
    @CsvSource(
            value = {
                    "collinearpoints/small.txt,          2",
                    "collinearpoints/horizontal5.txt,    5",
                    "collinearpoints/horizontal25.txt,   25",
                    "collinearpoints/horizontal50.txt,   50",
                    "collinearpoints/horizontal75.txt,   75",
                    "collinearpoints/horizontal100.txt,  100",
                    "collinearpoints/vertical5.txt,      5",
                    "collinearpoints/vertical50.txt,     50",
                    "collinearpoints/vertical75.txt,     75",
                    "collinearpoints/vertical100.txt,    100",
                    "collinearpoints/input6.txt,         1",
                    "collinearpoints/input8.txt,         2",
                    "collinearpoints/input9.txt,         1",
                    "collinearpoints/input40.txt,        4",
                    "collinearpoints/input48.txt,        6",
                    "collinearpoints/input50.txt,        7",
                    "collinearpoints/input80.txt,        31",
                    "collinearpoints/input299.txt,       6",
                    "collinearpoints/input300.txt,       6",
                    "collinearpoints/inarow.txt,         5",
                    "collinearpoints/equidistant.txt,    4",
                    "collinearpoints/kw1260.txt,         288",
                    "collinearpoints/random23.txt,       0",
                    "collinearpoints/random38.txt,       0",
                    "collinearpoints/random91.txt,       0",
                    "collinearpoints/random152.txt,      0",
            }
    )
    void checkSegmentCount(final String file, final int expectedResult) {
        Point[] points = pointsForFile(file);
        FastCollinearPoints collinear = new FastCollinearPoints(points);
        LineSegment[] segments = collinear.segments();

        for (LineSegment segment : segments) {
            StdOut.println(segment);
        }

        assertEquals(expectedResult, segments.length);
    }

    @ParameterizedTest(name = "The points contained in the file {0} should thrown an exception.")
    @CsvSource(
            value = {
                    "collinearpoints/duplicates2.txt",
                    "collinearpoints/duplicates3.txt",
                    "collinearpoints/duplicates4.txt"
            }
    )
    void invalidPointShouldThrowException(final String file) {
        Point[] points = pointsForFile(file);

        assertThrows(IllegalArgumentException.class, () -> new FastCollinearPoints(points));
    }
}
