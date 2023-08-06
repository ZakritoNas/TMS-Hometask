import java.util.Arrays;

public class PersonalArrayList<T> implements PersonalList<T> {
    private final int size = 4;
    private Object[] array;
    private int amountOfElements = 0;

    public PersonalArrayList (){
        array = new Object[size];
    }

    public PersonalArrayList (int personalSize){
        if (personalSize < 0){
            throw new IllegalArgumentException();
        }
        array = new Object[personalSize];
    }

    public int getSize (){
        return amountOfElements;
    }

    public void add(T arr) {
        if (amountOfElements == array.length) {
            resize(array.length * 2);
        }
        array[amountOfElements++] = arr;
    }

    public void remove(int index) {
        if (amountOfElements <= index || index < 0){
            throw new IllegalArgumentException();
        }
        for (int i = index; i< amountOfElements; i++){
            array[i] = array [i+1];
        }
        amountOfElements--;
    }

    public T foundIndex(int index) {
        if (amountOfElements <= index || index < 0){
            throw new IllegalArgumentException();
        }
        return (T) array[index];
    }

    public boolean foundElement(T arr) {
        for (int i = 0; i < amountOfElements; i++) {
            if (array[i].equals(arr)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        System.out.println(Arrays.toString(array));
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, amountOfElements);
        array = newArray;
    }

    @Override
    public String toString() {
        return "Ror{" +
                "intSize=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
