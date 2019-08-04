package edu.princeton.cs.algorithms.collinearpoints;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.CsvSource;

class PointTest {
    private static final Pattern pointPattern = Pattern.compile("Point\\((?<x>\\d+)\\s*,\\s* (?<y>\\d+)\\)");

    @ParameterizedTest(name = "Comparing {0} to {1} should be: {2}")
    @CsvSource(
            value = {
                    "Point(1, 1); Point(1, 1);   0",
                    "Point(1, 5); Point(1, 15); -1",
                    "Point(7, 3); Point(10, 3); -1",
                    "Point(6, 10); Point(2, 8);  1",
                    "Point(6, 4); Point(2, 4);   1",
                    "Point(10, 4); Point(9, 2);  1"
            },
            delimiter = ';'
    )
    void checkComparison(final String p1, final String p2, final int expectedResult) {
        assertEquals(expectedResult, point(p1).compareTo(point(p2)));
    }

    @ParameterizedTest(name = "Slope from {0} to {1} should be: {2}")
    @CsvSource(
            value = {
                    "Point(1, 1); Point(1, 1);   NEGATIVE_INFINITY",
                    "Point(5, 3); Point(5, 9);   POSITIVE_INFINITY",
                    "Point(5, 3); Point(7, 3);   0",
                    "Point(7, 6); Point(4, 3);   1.0",
            },
            delimiter = ';'
    )
    void checkSlope(final String p1, final String p2, final @ConvertWith(DoubleConverter.class) Double expectedResult) {
        assertEquals(expectedResult, point(p1).slopeTo(point(p2)));
    }

    private Point point(final String strPoint) {
        final Matcher p = pointPattern.matcher(strPoint);

        if (!p.matches()) {
            throw new IllegalArgumentException(
                    String.format("The string \"%s\" is not a valid point definition", strPoint)
            );
        }

        // This conversion is safe because of the way the regex is defined.
        final int x = Integer.parseInt(p.group("x"));
        final int y = Integer.parseInt(p.group("y"));

        return new Point(x, y);
    }

    static private class DoubleConverter extends SimpleArgumentConverter {
        @Override
        protected Object convert(final Object source, final Class<?> targetType) throws ArgumentConversionException {
            if (!(source instanceof String)) {
                throw new IllegalArgumentException("The argument should be a string: " + source);
            }
            try {
                if (source.equals("POSITIVE_INFINITY")) {
                    return Double.POSITIVE_INFINITY;
                }
                if (source.equals("NEGATIVE_INFINITY")) {
                    return Double.NEGATIVE_INFINITY;
                }

                return Double.parseDouble((String) source);
            } catch (Exception e) {
                throw new IllegalArgumentException("Failed to convert", e);
            }
        }
    }
}
