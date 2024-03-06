package l29;

interface IntList {
    int get(int index);
    void add(int value);
    boolean remove(int index);
    int size();
    void add(int value, int index);
    void addLast(int value);
    void addFirst(int value);
    void clean();
// опционально: добавить итератор как в домашке 28
}
