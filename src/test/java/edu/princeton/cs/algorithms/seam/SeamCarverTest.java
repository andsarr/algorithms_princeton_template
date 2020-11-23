package edu.princeton.cs.algorithms.seam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeamCarverTest {

    @Test
    void constructorShouldThrowIfPictureIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new SeamCarver(null));
    }

    // TODO: write your own unit tests here
}
