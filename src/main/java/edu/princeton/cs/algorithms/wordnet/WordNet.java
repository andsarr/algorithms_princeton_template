package edu.princeton.cs.algorithms.wordnet;

public class WordNet {

    /**
     * Constructor takes the name of the two input files.
     * @throws IllegalArgumentException if any argument is null or if the content does not correspond
     * to a rooted directed acyclic graph (DAG).
     */
    public WordNet(String synsets, String hypernyms) {

    }

    /**
     * @return all WordNet nouns
     */
    public Iterable<String> nouns() {
        return null;
    }

    /**
     * Is the word a WordNet noun?
     * @param word
     * @throws IllegalArgumentException if word is null
     */
    public boolean isNoun(String word) {
        return false;
    }

    /**
     * Returns the length of the shortest ancestral path between nounA and nounB.
     * @throws IllegalArgumentException if any argument is null or not a noun in the WordNet
     */
    public int distance(String nounA, String nounB) {
        return 0;
    }

    /**
     * Returns a synset (second field of synsets.txt) that is the common ancestor of nounA and nounB
     * in a shortest ancestral path.
     * @throws IllegalArgumentException if any argument is null or not a noun in the WordNet
     */
    public String sap(String nounA, String nounB) {
        return null;
    }

    // Do unit testing of this class
    public static void main(String[] args) {
    }
}
