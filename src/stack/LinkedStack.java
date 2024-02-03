package stack;


import java.util.EmptyStackException;

class Node<E>{
    Node<E> next;


    E element;



    public Node(E value){
        this.next = null;
        this.element = value;
    }
}
public class LinkedStack <E>{
    private Node<E> head;
    private int size;

    public LinkedStack(){
        this.head = null;
        this.size = 0;
    }

    public void push(E value){
        Node<E> temp = new Node<>(value);
        if(head == null){
            head = temp;
        }
        temp.next = head;
        head = temp;

        size++;
    }

    public E pop(){
        if(head == null) throw  new EmptyStackException();
        E popVal = head.element;

        head = head.next;
        size--;

        return popVal;
    }

    public E peek(){
        return head.element;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size > 0;
    }
}

class TestLink{
    public static void main(String[] args) {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();

        linkedStack.push(10);
        linkedStack.push(15);
        linkedStack.push(25);
        System.out.println(linkedStack.pop());
        linkedStack.push(35);
        System.out.println(linkedStack.peek());
        System.out.println(linkedStack.size());
        System.out.println(linkedStack.isEmpty());
    }
}
