public interface Graph<E>{
    void add (E value);
    boolean contains(E value);
    int size();
    void connectDirect(E a, E b);
    void connectUndirected(E a, E b);
    boolean connect(E a, E b);
}
