public class Node {
    Object value;
    Node next;

    public Node(Object valor) {
        this.value = valor;
        this.next = null;
    }

    public Object getValue() {
        return this.value;
    }

    public void linkNext(Node n) {
        this.next = n;
    }

    public Node getNext() {
        return this.next;
    }

    public void deleteENext() {
        this.next = null;
    }
}
