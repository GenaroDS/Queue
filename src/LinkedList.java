public class LinkedList {
    Node head;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public void peek(){
        if (head == null) {
            System.out.println("The queue is empty");
        } else if (this.head.getNext() == null) {
            System.out.println("First in line: "+ head.getValue());
        } else {
            Node last = this.head.getNext();
            while (true) {                
                if (last.getNext() == null) {
                    System.out.println("First in line: "+ last.getValue());
                    break;
                } else {
                    last = last.getNext();
                }
            }
        }
        size++;
    }
    

    public void dequeue() {
        if (this.size() > 0) {
            this.head = this.head.getNext();
        } else {
            System.out.println("No orders to process");
        }
        size--;
    }

    public Object getValue(int index) {
        int counter = 0;
        Node temporal = head;
        while (counter < index) {
            temporal = temporal.getNext();
            counter++;
        }
        return temporal.getNext();
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void showOrders() {
        Node littleNode = this.head;
        if (littleNode != null) {
            System.out.println(littleNode.getValue().toString());
            while (littleNode.getNext() != null) {
                littleNode = littleNode.getNext();
                System.out.println(littleNode.getValue().toString());
            }
        } else {
            System.out.println("The list is empty");
        }
    }

    public void enqueue(Object obj) {
        Node node = new Node(obj);
        if (head == null) {
            head = node;
        } else if (this.head.getNext() == null) {
            this.head.linkNext(node);
        } else {
            Node last = this.head.getNext();
            while (true) {
                if (last.getNext() == null) {
                    last.linkNext(node);
                    break;
                } else {
                    last = last.getNext();
                }
            }
        }
        size++;
    }
}
