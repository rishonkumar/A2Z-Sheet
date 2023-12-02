package LinkedList;


class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkedList {

    private static Node converArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }


    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 2};
        Node y = new Node(arr[0], null);

        System.out.println(y.data);
    }
}
