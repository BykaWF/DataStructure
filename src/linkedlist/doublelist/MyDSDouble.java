package linkedlist.doublelist;

class Node {
    Node next;
    Node prev;
    int data;

    public Node(int data) {
        this.data = data;
    }

}

public class MyDSDouble {
    public static void main(String[] args) {
        Node head = null;
        head = insertAtEnd(head, 1);
        head = insertAtEnd(head, 2);
        head = insertAtEnd(head, 3);
        head = insertAtEnd(head, 4);

        head = reverse(head);

        head = deleteTail(head);

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static Node insertAtBegin(Node head, int data) {
        Node node = new Node(data);
        node.next = head;
        if (head != null) head.prev = node;

        return node;
    }

    public static Node deleteHead(Node head) {

        if (head.next == null || head == null) return head;

        head = head.next;
        head.prev = null;

        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) return null;

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.prev.next = null;

        return head;
    }

    public static Node insertAtEnd(Node head, int data) {
        Node temp = new Node(data);

        if (head == null) return temp;
        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = temp;
        temp.prev = curr;

        return head;
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null) return head;

        Node prevNode = null;
        Node curr = head;

        while (curr != null) {
            prevNode = curr.prev; // null
            curr.prev = curr.next; // 2
            curr.next = prevNode; // null

            curr = curr.prev; // 2
        }

        return prevNode.prev;
    }
}
