package l29;

class DoublyLinkedList implements IntList {
    DoubleNode head;  // Начало списка
    DoubleNode tail;  // Конец списка
    int size;  // Размер списка

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private DoubleNode getNode(int index) {
        if (index >= this.size && index >= 0)
            return null;

        int i = 0;
        DoubleNode node = this.head;

        while (i < index) {
            node = node.next;
            i++;
        }

        return node;
    }

    @Override
    public int get(int index) {
        DoubleNode node = getNode(index);
        return node == null ? 0 : node.data;
    }

    @Override
    public void add(int value) {
        DoubleNode node = new DoubleNode(value);

        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }

        size++;
    }

    @Override
    public boolean remove(int index) {
        DoubleNode node = getNode(index);
        if (node == null)
            return false;

        size--;

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            return true;
        } else if (this.size == 2 && index == 1) {
            node.prev.next = null;
            this.tail = node.prev;
            return true;
        } else if (this.size == 2 && index == 0) {
            node.next.prev = null;
            this.head = node.next;
            return true;
        }

        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = null;
        node.prev = null;

        return true;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public void add(int value, int index) { //Вставка по выбранному индексу
        DoubleNode current = head;
        int c = 0;
        while (current != null && c != index){
            current = current.next;
            c++;
        }
        DoubleNode node = new DoubleNode(value);
        current.prev.next = node;
        node.prev = current.prev;
        current.prev = node;
        node.next = current;

    }

    @Override
    public void addFirst(int value) {
        DoubleNode node = new DoubleNode(value); //Создание нового узла

        if (this.size == 0) {  //проерка пустой ли узел
            this.tail = node;
        } else {
            this.head.prev = node;
        }
        this.head = node;
        this.head.next = this.tail;
        size++;
    }
    @Override
    public void addLast(int value) {
        DoubleNode node = new DoubleNode(value);
        if (this.size == 0) {
            this.head = node;
        } else {
            this.tail.next = node;
        }
        node.prev = this.tail;
        this.tail = node;
        size++;
    }
    public void clean(){
        this.head = null;
        this.tail = null;
        size = 0;
    }

}