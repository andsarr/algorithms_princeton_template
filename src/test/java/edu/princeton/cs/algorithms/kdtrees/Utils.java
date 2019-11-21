package edu.princeton.cs.algorithms.kdtrees;

import com.google.common.collect.ImmutableMap;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;
import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Utils {
    static Point2D point(final double x, final double y) {
        return new Point2D(x, y);
    }

    static RectHV rect(final double x0, final double y0, final double x1, final double y1) {
        return new RectHV(x0, y0, x1, y1);
    }

    static Stream<Arguments> containsProvider() {
        // @formatter:off
        return Stream.of(
                Arguments.of("kdtrees/input10.txt",
                        ImmutableMap.of(
                                point(0.083, 0.510), Boolean.TRUE,

                                point(0.499, 0.208), Boolean.TRUE,

                                point(0.800, 0.900), Boolean.FALSE
                        )
                ),
                Arguments.of("kdtrees/random10.txt",
                        ImmutableMap.of(
                                point(0.50, 0.25), Boolean.TRUE,   // P9

                                point(1.00, 0.00), Boolean.TRUE,   // P5

                                point(0.75, 0.50), Boolean.TRUE,    // P6

                                point(1.00, 0.50), Boolean.TRUE,    // P8

                                point(0.50, 1.00), Boolean.TRUE    // P7
                        )
                ),
                Arguments.of("kdtrees/random20.txt",
                        ImmutableMap.of(
                                point(0.500, 0.250), Boolean.FALSE,

                                point(1.000, 0.125), Boolean.TRUE,   // P18

                                point(0.500, 0.500), Boolean.TRUE,   // P12

                                point(0.125, 1.000), Boolean.TRUE,   // P5

                                point(1.000, 0.625), Boolean.TRUE    // P20
                        )
                )
        );
        // @formatter:on
    }

    static Stream<Arguments> nearestProvider() {
        return Stream.of(
                Arguments.of("kdtrees/input5.txt",
                        ImmutableMap.of(
                                point(0.671, 0.567), /* P5 */ point(0.9, 0.6)
                        )
                ),
                Arguments.of("kdtrees/input10.txt",
                        ImmutableMap.of(
                                point(0.85, 0.80),  /*  P8  */   point(0.862, 0.825),
                                point(0.40, 0.50),  /*  P1  */   point(0.372, 0.497),
                                point(0.20, 0.95),  /*  P6  */   point(0.320, 0.708),
                                point(0.88, 0.105), /*  P10 */   point(0.499, 0.208)
                        )
                ),
                Arguments.of("kdtrees/vertical7.txt",
                        ImmutableMap.of(
                                point(0.20, 0.20), point(0.3, 0.2),
                                point(1.05, 0.95), point(0.3, 0.9),
                                point(1.10, 0.0),  point(0.3, 0.1)
                        )
                )
        );
    }

    static Stream<Arguments> rangeProvider() {
        return Stream.of(
                Arguments.of("kdtrees/input10.txt",
                        ImmutableMap.of(
                                rect(0.75, 0.50, 1.0, 1.0),
                                Arrays.asList(
                                    point(0.785, 0.725), point(0.862, 0.825)
                                ),

                                rect(0.85, 0.0, 1.10, 0.50),
                                Collections.emptyList(),

                                rect(0.05, 0.40, 0.40, 0.60),
                                Arrays.asList(
                                    point(0.083, 0.51), point(0.226, 0.577), point(0.372, 0.497)
                                ),

                                rect(0.05, 0.30, 0.8, 0.65),
                                Arrays.asList(
                                    point(0.372, 0.497), point(0.564, 0.413), point(0.417, 0.362),
                                    point(0.083, 0.510), point(0.226, 0.577)
                                )
                        )
                ),
                Arguments.of("kdtrees/vertical7.txt",
                        ImmutableMap.of(
                                rect(0.20, 0.50, 0.30, 0.90),
                                Arrays.asList(
                                    point(0.30, 0.50), point(0.30, 0.70), point(0.30, 0.80),
                                    point(0.30, 0.90)
                                ),

                                rect(0.80, 0.1, 1.0, 1.0),
                                Collections.emptyList(),

                                rect(0.20, 0.10, 0.50, 0.30),
                                Arrays.asList(
                                    point(0.30, 0.10), point(0.30, 0.20)
                                )
                        )
                ),
                Arguments.of("kdtrees/random10-1.txt",
                        ImmutableMap.of(
                                rect(0.25, 0.0, 1.0, 0.75),
                                Arrays.asList(
                                    point(0.75, 0.25), point(0.5, 0.0), point(0.5, 0.25),
                                    point(0.75, 0.75), point(0.5, 0.75), point(1.0, 0.5)
                                )
                        )
                )
        );
    }
}
