package edu.princeton.cs.algorithms.percolation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import edu.princeton.cs.algs4.In;

class PercolationTest {

    @ParameterizedTest(name = "Testing using the file {0}")
    @CsvSource({
            "percolation/heart25.txt,     not percolates",
            "percolation/snake13.txt,     percolates",
            "percolation/input3.txt,      percolates",
            "percolation/input10-no.txt,  not percolates",
            "percolation/greeting57.txt,  not percolates",
            "percolation/java60.txt,      percolates"
    })
    void percolate(final String fileName, final String expectedResult) {
        final In in = new In(fileName);
        final int n = in.readInt();

        final Percolation percolation = new Percolation(n);

        while (!in.isEmpty()) {
            final int i = in.readInt();
            final int j = in.readInt();
            percolation.open(i, j);
        }

        final String percolates = (percolation.percolates()) ? "percolates" : "not percolates";

        assertEquals(
            expectedResult, percolates,
            () -> String.format("The data inside the file %s should %s", fileName, expectedResult)
        );
    }

}
