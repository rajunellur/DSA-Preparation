package linkedlist;

public class AddLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
//    public static Node AddLL_Kposition (Node n,int k,Node head){
//
//    }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        int k = 4;
        Node n = new Node(80);
        Node head = n1;
    }
}
