package linkedlist.singlelist;


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

        head = insertAtEnd(head, 1);
        head = insertAtEnd(head, 3);
        head = insertAtEnd(head, 4);
        head = insertAtEnd(head, 5);
        head = sortedInsert(head, 6);
        head = sortedInsert(head, 2);
//        printMiddle(head);
//        printMid1(head);
//        printNth(head,6);
//        printNth2(head, 2);

//        head = reverse(head);
//        head = reverseRec1(head);
        head = reverse2(head,null);
//       head = insertAtEnd(head,10);
        printList(head);

    }

    public static Node reverse(Node head) {
        Node curr = head;
        Node nextNode = null;
        Node prev = null;

        while (curr != null) {
            nextNode = curr.next; // 2-> 3 -> 4 ....
            curr.next = prev; // -> 1 -> null
            prev = curr; // 1
            curr = nextNode; // 2 -> 3 - > 4
        }

        return prev;
    }

    public static Node reverseRec1(Node head) {

        if (head == null || head.next == null) {
            System.out.println("Base case reached. Returning: " + head.val); // Print base case
            return head;
        }

        System.out.println("Current head: " + head.val); // Print current head

        Node restHead = reverseRec1(head.next);
        Node restTail = head.next;
        restTail.next = head;
        head.next = null;

        System.out.println("Reversed head: " + restHead.val); // Print reversed head

        return restHead;
    }

    public static Node reverse2(Node curr, Node prev) {
        if(curr == null) return prev;

        Node next = curr.next;
        curr.next = prev;
        return reverse2(next,curr);
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

    public static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        }
        return head.next;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node curr = head;

        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;

        return head;
    }

    public static int searchLL(Node head, int x) {
        int k = 1;
        Node curr = head;

        while (curr != null) {
            if (curr.val == x) {
                return k;
            }
            curr = curr.next;
            k++;
        }
        return -1;
    }

    public static int searchLLRec(Node head, int x, int k) {
        if (head == null) {
            return -1;
        }

        if (head.val == x) {
            return k;
        }

        return searchLLRec(head.next, x, k + 1);
    }

    public static Node sortedInsert(Node head, int val) {
        Node temp = new Node(val);

        if (head == null) return temp;
        if (val < head.val) {
            temp.next = head;
            return temp;
        }

        Node curr = head;
        Node prev = null;


        while (curr.next != null && (curr.next.val < val)) {
            curr = curr.next;
        }

        temp.next = curr.next;
        curr.next = temp;

        return head;
    }

    public static void printMiddle(Node head) {
        Node curr = head;

        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }


        int pos = (count / 2);
        curr = head;
        while (pos != 0) {
            curr = curr.next;
            pos--;
        }
        System.out.println(curr.val);

    }

    public static void printMid1(Node head) {
        if (head == null) return;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
    }

    public static void printNth(Node head, int n) {
        int len = 0;

        Node curr = head;

        while (curr != null) {
            len++;
            curr = curr.next;
        }
        if (n > len) {
            return;
        }

        int nth = len - n;


        curr = head;
        while (nth != 0) {
            curr = curr.next;
            nth--;
        }
        System.out.println(curr.val);
    }

    public static void printNth2(Node head, int n) {
        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {
            if (second == null) return;
            second = second.next;
        }

        while (second != null) {
            first = first.next;
            second = second.next;
        }

        System.out.println(first.val);
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
