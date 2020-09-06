package edu.princeton.cs.algorithms.wordnet;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Outcast {

    /**
     * Given a list of WordNet nouns x1, x2, ..., xn, determines which noun is
     * the least related to the others (an "outcast"). Precisely, an outcast is
     * the noun in the list that maximizes the sum of distances from it to all
     * the others noun in the list.
     */
    public Outcast(WordNet wordnet) {

    }

    public String outcast(String[] nouns) {
        return null;
    }

    public static void main(String[] args) {
        WordNet wordnet = new WordNet(args[0], args[1]);
        Outcast outcast = new Outcast(wordnet);
        for (int t = 2; t < args.length; t++) {
            In in = new In(args[t]);
            String[] nouns = in.readAllStrings();
            StdOut.println(args[t] + ": " + outcast.outcast(nouns));
        }
    }
}
