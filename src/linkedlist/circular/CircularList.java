package linkedlist.circular;

class Node {
    Node next;
    Node prev;
    int data;

    public Node(int data) {
        this.data = data;
    }

}

public class CircularList {
    public static void main(String[] args) {
//        Node head = new Node(1);
//        Node temp1 = new Node(2);
//        Node temp2 = new Node(3);
//
//        head.next = temp1;
//        temp1.next = temp2;
//        temp2.next = head;
//
////        printCL(head);
//        printCLdo(head);

        Node circularD = null;
        circularD = insertAtBeginD(circularD,1);
        circularD = insertAtBeginD(circularD,2);
        printCLdo(circularD);
    }

    public static Node insertAtBeginD(Node head, int val) {
        Node temp = new Node(val);
        if (head == null) {
            temp.next = temp;
            temp.prev = temp;
            return temp;
        } else {
            temp.prev = head.prev;
            temp.next = head;

            head.prev.next = temp;
            head.prev = temp;

        }

        return head;
    }

    public static void printCL(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        Node curr = head.next;

        while (curr != head) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void printCLdo(Node head) {
        if (head == null) return;
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);

    }
}
