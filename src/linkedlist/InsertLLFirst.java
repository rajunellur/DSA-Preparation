package linkedlist;

public class InsertLLFirst {
   private Node head;
    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node Insert_First(Node head, int data){
        Node n1 = new Node(10);
        n1.data = data;
        n1.next = head;

        return head;
    }
    public void display(){
        Node current = head;
        while(current != null){
            System.out.println(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
        System.out.println();
    }
    public static void main(String[] args) {
        Node n2 = new Node(20);
        Node n3 = new Node( 30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);

        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        Node head = n2;
        Node n1 = new Node(10);

        InsertLLFirst result = new InsertLLFirst();
        result.display();
    }
}
