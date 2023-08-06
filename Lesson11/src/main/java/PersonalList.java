public interface PersonalList <T> {
    int getSize();
    void add(T arr);
    void remove(int index);
    T foundIndex (int index);
    boolean foundElement(T arr);
    void clear();
}
