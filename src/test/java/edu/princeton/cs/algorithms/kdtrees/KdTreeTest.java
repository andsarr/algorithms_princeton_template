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

import static edu.princeton.cs.algorithms.kdtrees.Utils.point;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Test cases for the class KdTree")
class KdTreeTest {

    @DisplayName("Corner cases: An IllegalArgumentException must be thrown if any argument is null")
    @Test
    void checkingCornerCases() {
        final KdTree tree = new KdTree();

        assertThrows(IllegalArgumentException.class, () -> tree.insert(null));

        assertThrows(IllegalArgumentException.class, () -> tree.contains(null));

        assertThrows(IllegalArgumentException.class, () -> tree.range(null));

        assertThrows(IllegalArgumentException.class, () -> tree.nearest(null));
    }

    @DisplayName(value = "Testing the basic operations: \"isEmpty\" and \"size\"")
    @Test
    void testBasicOperations() {
        final KdTree tree = new KdTree();

        assertTrue(tree.isEmpty());
        assertEquals(0, tree.size());

        tree.insert(point(0.1, 1.0));

        assertFalse(tree.isEmpty());
        assertEquals(1, tree.size());

        tree.insert(point(0.2, 0.5));
        tree.insert(point(0.08, 0.3));

        // This shouldn't have any effect.
        tree.insert(point(0.08, 0.3));
        tree.insert(point(0.2, 0.5));

        assertEquals(3, tree.size());
    }

    @DisplayName(value = "Testing the function \"contains\".")
    @ParameterizedTest(name = "Using the points in the file {0} the queries {1} should work")
    @MethodSource(value = "edu.princeton.cs.algorithms.kdtrees.Utils#containsProvider")
    void containsTest(final String fileName, final Map<Point2D, Boolean> queries) {
        final KdTree tree = readFile(fileName);

        for (Map.Entry<Point2D, Boolean> entry : queries.entrySet()) {
            final Point2D p = entry.getKey();
            boolean expectedResult = entry.getValue();

            String msg = String.format("The point %s should%s be found in the set", p, ((expectedResult) ? ""  : "n't"));
            assertEquals(expectedResult, tree.contains(p), msg);
        }
    }

    @DisplayName(value = "Testing the function \"range\".")
    @ParameterizedTest(name = "Using the points in the file {0} the queries {1} should work")
    @MethodSource("edu.princeton.cs.algorithms.kdtrees.Utils#rangeProvider")
    void rangeTest(final String fileName, final Map<RectHV, List<Point2D>> queries) {
        final KdTree tree = readFile(fileName);

        for (Map.Entry<RectHV, List<Point2D>> entry : queries.entrySet()) {
            final RectHV rect = entry.getKey();
            final List<Point2D> expectedPoints = entry.getValue();

            final List<Point2D> inRect = Lists.newArrayList(tree.range(rect));

            assertEquals(expectedPoints.size(), inRect.size());

            for (final Point2D p: inRect) {
                assertTrue(expectedPoints.contains(p));
            }
        }
    }

    @DisplayName(value = "Testing the function \"nearest\".")
    @ParameterizedTest(name = "Using the points in the file {0} the queries {1} should work")
    @MethodSource("edu.princeton.cs.algorithms.kdtrees.Utils#nearestProvider")
    void nearestTest(final String fileName, final Map<Point2D, Point2D> queries) {
        final KdTree tree = readFile(fileName);

        for (Map.Entry<Point2D, Point2D> entry : queries.entrySet()) {
            final Point2D p = entry.getKey();
            final Point2D expectedNearest = entry.getValue();
            final Point2D nearest = tree.nearest(p);

            assertEquals(expectedNearest, nearest,
                String.format(
                    "\nThe nearest point to %s should be %s.\n\tDistance to expected: %.5f\n\tDistance to found: %.5f\n",
                    p, expectedNearest, expectedNearest.distanceSquaredTo(p), nearest.distanceSquaredTo(p)
                )
            );
        }

    }

    private KdTree readFile(String fileName) {
        final KdTree tree = new KdTree();

        In in = new In(fileName);
        while (!in.isEmpty()) {
            double x = in.readDouble();
            double y = in.readDouble();
            Point2D p = new Point2D(x, y);
            tree.insert(p);
        }

        return tree;
    }
}
