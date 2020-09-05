package edu.princeton.cs.algorithms.wordnet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordNetTest {

    @Test
    void shouldThrowIfAnyArgumentIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new WordNet(null, null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new WordNet(null, "hypernyms.txt"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new WordNet("synsets.txt", null));
    }

}
