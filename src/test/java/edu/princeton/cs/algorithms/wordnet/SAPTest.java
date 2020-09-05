package edu.princeton.cs.algorithms.wordnet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SAPTest {

    @Test
    void shouldThrowForNullArgument() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new SAP(null));
    }

}
