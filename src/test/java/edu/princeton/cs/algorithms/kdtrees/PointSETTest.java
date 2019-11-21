package edu.princeton.cs.algorithms.kdtrees;

import com.google.common.collect.Lists;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Test cases for the class PointSET")
class PointSETTest {

    @DisplayName("Corner cases: An IllegalArgumentException must be thrown if any argument is null")
    @Test
    void checkingCornerCases() {
        final PointSET tree = new PointSET();

        assertThrows(IllegalArgumentException.class, () -> tree.insert(null));

        assertThrows(IllegalArgumentException.class, () -> tree.contains(null));

        assertThrows(IllegalArgumentException.class, () -> tree.range(null));

        assertThrows(IllegalArgumentException.class, () -> tree.nearest(null));
    }

    @DisplayName(value = "Testing the function \"nearest\".")
    @ParameterizedTest(name = "Using the points in the file {0} the queries {1} should work")
    @MethodSource("edu.princeton.cs.algorithms.kdtrees.Utils#nearestProvider")
    void nearestTest(final String fileName, final Map<Point2D, Point2D> queries) {
        final PointSET pointSet = readFile(fileName);

        for (Map.Entry<Point2D, Point2D> entry : queries.entrySet()) {
            final Point2D p = entry.getKey();
            final Point2D expectedNearest = entry.getValue();

            assertEquals(expectedNearest, pointSet.nearest(p),
                    String.format("The nearest point to %s should be %s", p, expectedNearest));
        }

    }

    @DisplayName(value = "Testing the function \"range\".")
    @ParameterizedTest(name = "Using the points in the file {0} the queries {1} should work")
    @MethodSource("edu.princeton.cs.algorithms.kdtrees.Utils#rangeProvider")
    void rangeTest(final String fileName, final Map<RectHV, List<Point2D>> queries) {
        final PointSET pointSet = readFile(fileName);

        for (Map.Entry<RectHV, List<Point2D>> entry : queries.entrySet()) {
            final RectHV rect = entry.getKey();
            final List<Point2D> expectedPoints = entry.getValue();

            final List<Point2D> inRect = Lists.newArrayList(pointSet.range(rect));

            assertEquals(expectedPoints.size(), inRect.size());

            for (final Point2D p: inRect) {
                assertTrue(expectedPoints.contains(p));
            }
        }
    }

    private PointSET readFile(String fileName) {
        final PointSET pointSet = new PointSET();

        In in = new In(fileName);
        while (!in.isEmpty()) {
            double x = in.readDouble();
            double y = in.readDouble();
            Point2D p = new Point2D(x, y);
            pointSet.insert(p);
        }

        return pointSet;
    }
}
