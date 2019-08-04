package edu.princeton.cs.algorithms.collinearpoints;

import static edu.princeton.cs.algorithms.collinearpoints.Utils.pointsForFile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class BruteCollinearPointsTest {

    @ParameterizedTest(name = "The amount of segments detected for the file {0} should be {1}")
    @CsvSource(
            value = {
                    "collinearpoints/horizontal5.txt,    5",
                    "collinearpoints/horizontal25.txt,   25",
                    "collinearpoints/horizontal50.txt,   50",
                    "collinearpoints/horizontal75.txt,   75",
                    "collinearpoints/horizontal100.txt,  100",
                    "collinearpoints/vertical5.txt,      5",
                    "collinearpoints/vertical50.txt,     50",
                    "collinearpoints/vertical75.txt,     75",
                    "collinearpoints/vertical100.txt,    100",
                    "collinearpoints/input8.txt,         2",
                    "collinearpoints/input40.txt,        4",
                    "collinearpoints/equidistant.txt,    4"
            }
    )
    void checkSegmentCount(final String file, final int expectedResult) {
        Point[] points = pointsForFile(file);
        BruteCollinearPoints collinear = new BruteCollinearPoints(points);
        LineSegment[] segments = collinear.segments();

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

        assertThrows(IllegalArgumentException.class, () -> new BruteCollinearPoints(points));
    }
}
