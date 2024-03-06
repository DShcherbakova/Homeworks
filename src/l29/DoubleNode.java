package l29;

class DoubleNode {
    int data;
    DoubleNode prev;  // Ссылка на предыдущий узел
    DoubleNode next;  // Ссылка на следующий узел

    public DoubleNode(int data) {
        this.data = data;
        this.prev = null;  // По умолчанию предыдущий узел не задан
        this.next = null;  // По умолчанию следующий узел не задан
    }
}