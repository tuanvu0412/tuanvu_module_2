package ss9_arraylist.bai_tap.bai_1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = (E[]) new Object[DEFAULT_CAPACITY];

    }

    public MyList(int size) {
        element = (E[]) new Object[size];
    }
    public Boolean add(E o, int index) {
        if (index >= 0 && index <= size) {
            size++;
            for (int i = size - 1; i > index; i--) {
                element[i+1]= element[i];
            }
            element[index]= o;
            return true;
        }
    return false;
    }
    public E get(int i ){
        if(i >=size || i <0){
            throw  new IndexOutOfBoundsException("index: "+i+", Size"+i);
        }
        return (E) element[i];
    }
    public Object remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                element[i] = element[i + 1];
            }
            size -= 1;
        }
        return (E)element[index];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", element=" + Arrays.toString(element) +
                '}';
    }

}
