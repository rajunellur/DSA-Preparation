package linkedlist;

public class CreateLinkedList {
   public void display(Node head){
       if(head == null){
           return;
       }
       Node current = head;
       while(current != null){
           System.out.print(current.data + "-->");
           current = current.next;
       }
       System.out.print(current);
   }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = fourth;

        CreateLinkedList print = new CreateLinkedList();
        print.display(head);

    }
}
