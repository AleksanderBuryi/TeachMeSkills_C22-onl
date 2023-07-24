package task2.Main;

import task2.interfaces.CustomList;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private Object[] elements;
    private int pointer = 0;
    private static final int DEFAULT_SIZE = 10;

    public CustomArrayList() {
        this.elements = new Object[DEFAULT_SIZE];
    }

    public CustomArrayList(int size) {
        if (size > 0) {
            this.elements = new Object[size];
        } else if (size == 0) {
            this.elements = new Object[]{};
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + size);
        }
    }

    @Override
    public void add(T element) {
        if(pointer == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[pointer++] = element;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= elements.length)
            return false;

        deleteElement(index);
        return true;
    }

    private void deleteElement(int index) {
        if (elements.length - 1 - index >= 0)
            System.arraycopy(elements, index + 1, elements, index, elements.length - 1 - index);
        elements[elements.length-1] = null;
        pointer--;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.length);
        } else {
            return (T) elements[index];
        }

    }

    @Override
    public boolean contains(T element) {
        for (Object t : elements) {
            if (element.equals(t))
                return true;
        }

        return false;
    }

    @Override
    public void clear() {
        elements = new Object[DEFAULT_SIZE];
        pointer = 0;
    }

    public int length() {
        return elements.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList: " + Arrays.toString(elements);
    }
}
