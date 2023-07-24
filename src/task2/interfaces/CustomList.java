package task2.interfaces;

public interface CustomList<T> {
    void add(T element);
    boolean remove(int index);
    T get(int index);
    boolean contains(T element);
    void clear();
}
