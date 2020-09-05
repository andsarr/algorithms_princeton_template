/**
 * Throw an IllegalArgumentException in the following situations:
 *     Any argument is null
 *     Any vertex argument is outside its prescribed range
 *     Any iterable argument contains a null item
 */
package edu.princeton.cs.algorithms.wordnet;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class SAP {

    public SAP(Digraph G) {

    }

    /**
     * Returns the length of shortest ancestral path between v and w; -1 if no such path.
     */
    public int length(int v, int w) {
        return 0;
    }

    /**
     * Returns a common ancestor of v and w that participates in a shortest ancestral path; -1 if no such path.
     */
    public int ancestor(int v, int w) {
        return 0;
    }

    /**
     * Returns the length of shortest ancestral path between any vertex in v and any vertex in w; -1 if no such path
     */
    public int length(Iterable<Integer> v, Iterable<Integer> w) {
        return 0;
    }

    /**
     * Returns a common ancestor that participates in shortest ancestral path; -1 if no such path.
     */
    public int ancestor(Iterable<Integer> v, Iterable<Integer> w) {
        return 0;
    }

    // Do unit testing of this class
    public static void main(String[] args) {
        In in = new In(args[0]);
        Digraph G = new Digraph(in);
        SAP sap = new SAP(G);
        while (!StdIn.isEmpty()) {
            int v = StdIn.readInt();
            int w = StdIn.readInt();
            int length   = sap.length(v, w);
            int ancestor = sap.ancestor(v, w);
            StdOut.printf("length = %d, ancestor = %d\n", length, ancestor);
        }
    }
}
