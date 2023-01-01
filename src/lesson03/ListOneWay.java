package lesson03;

public class ListOneWay {
    private Node head;

    public void addFirst(int value){
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void removeFirst(){
        if (head != null){
            head = head.next;
        }
    }
    public boolean contains(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }
    public void removeLast() {
        if (head != null) {
            Node node = head;
            while (node.next != null) {
                if (node.next.next == null) {
                    node.next = null;
                    return;
                }
                node = node.next;
            }
            head = null;
        }
    }


    private class Node {
        private Node next;
        private int value;
    }
    //Решение для односвязного списка
    public void revert() {
        if (head != null && head.next != null) {
            revert(head, head.next);
        }
    }
    private void revert(Node current, Node next) {
        if (next.next != null) {
            revert(next, next.next);
        } else {
            head = next;
        }
        next.next = current;
        current.next = null;
    }
}


