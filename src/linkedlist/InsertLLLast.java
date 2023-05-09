package linkedlist;

public class InsertLLLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        public static Node InsertAtLast(Node head,Node n7){
            n7 = new Node(70);
            Node tail = head;
            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = n7;
            return head;
        }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);

        n4.next = n5;
        n5.next = n6;

        Node head = n1;
        Node n7 = new Node(70);
        System.out.println(InsertAtLast(head,n7));

    }
}
