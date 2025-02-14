import java.util.AbstractList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

public class MyArrayList<E>{
    private static final int DEFAULT_ELEMENTS_SIZE = 10;

    private int size;
    private Object[] elements;

    public MyArrayList(){
        this(DEFAULT_ELEMENTS_SIZE);
    }

    public MyArrayList(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("MyArrayList capacity can't be negative");

        elements = new Object[capacity];
        size=0;
    }

    public int size() {
        return size;
    }

    public boolean add(E newEntry){
        ensureCapacity(size + 1);
        elements[size] = newEntry;
        size++;
        return true;
    }

    public void add(E newEntry, int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Index out of bounds");

        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = newEntry;
        size++;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (size == 0)
            throw new NoSuchElementException();
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Index out of bounds");

        return (E) elements[index];
    }

    @SuppressWarnings("unchecked")
    public E getFirst() {
        if (size == 0)
            throw new NoSuchElementException();
        return (E) elements[0];
    }

    @SuppressWarnings("unchecked")
    public E getLast() {
        if (size == 0)
            throw new NoSuchElementException();
        return (E) elements[size - 1];
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Index out of bounds");

        @SuppressWarnings("unchecked")
        E oldValue = (E) elements[index];

        System.arraycopy(elements, index + 1, elements, index, size - index);
        elements[size] = null;
        size--;
        return  oldValue;
    }

    private void ensureCapacity(int newSize) {
        if (elements.length < newSize)
            elements = Arrays.copyOf(elements, (int) Math.ceil(elements.length * 1.5));
    }

    @Override
    public String toString() {
        if (size == 0)
            return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size - 1; i++) {
            sb.append(elements[i]);
            sb.append(',').append(' ');
        }
        sb.append(elements[size - 1]);
        return sb.append(']').toString();
    }
}
