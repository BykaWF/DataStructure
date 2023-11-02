package linkedlist;


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        next = null;
    }
}


public class MyDs {

    public static void main(String[] args) {
        Node head = null;

        head = insertAtBegin(head, 2);
        head = insertAtBegin(head, 3);
        head = insertAtBegin(head, 4);
        head = insertAtEnd(head, 10);
        head = insertAtPos(head, 5, 5);
        head = deleteHead(head);
        head = deleteTail(head);
        System.out.println(searchLL(head,10));
        System.out.println(searchLLRec(head,4,1));


//       head = insertAtEnd(head,10);
        printList(head);

    }

    public static Node insertAtBegin(Node head, int val) {

        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        return head;
    }

    public static Node insertAtEnd(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            return newNode;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;
    }

    public static Node insertAtPos(Node head, int val, int pos) {
        Node node = new Node(val);
        if (pos == 1) {
            return insertAtBegin(head, val);
        }
        Node prev = head;
        int k = 1;

        while (k < pos - 1) {
            prev = prev.next;
            k++;
        }
        if (prev.next == null) {
            return insertAtEnd(head, val);
        }
        node.next = prev.next;
        prev.next = node;

        return head;
    }

    public static Node deleteHead(Node head){
        if(head == null){
            return null;
        }
        return head.next;
    }

    public static Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }

        Node curr = head;

        while (curr.next.next != null){
            curr = curr.next;
        }

        curr.next = null;

        return head;
    }

    public static int searchLL(Node head, int x ){
        int k = 1;
        Node curr = head;

        while (curr != null){
            if(curr.val == x){
                return k;
            }
            curr = curr.next;
            k++;
        }
        return -1;
    }

    public static int searchLLRec(Node head, int x, int k){
        if(head == null){
            return -1;
        }

        if(head.val == x){
            return k;
        }

       return searchLLRec(head.next,x, k + 1);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

}
