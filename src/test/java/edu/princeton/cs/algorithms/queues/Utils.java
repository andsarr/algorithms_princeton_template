package edu.princeton.cs.algorithms.queues;

class Utils {

    private Utils() {
        throw new java.lang.UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    /**
     *   This method will return the content of a collection of objects as string
     *
     * @param collection The "bag" of items. It must implements Iterable
     * @return String
     */
    static <T extends Iterable> String contentAsString(final T collection) {
        StringBuilder builder = new StringBuilder();

        for (Object elem: collection) {
            builder.append(elem);
        }

        return builder.toString();
    }

}
