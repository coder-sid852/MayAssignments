package MayAssignment.week2.May14;

public class PairwiseSwap {

    private static Node head; // head of the  list

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            
        }
    }
    private void addFirst(int data) {
        Node newNode = new Node(data);
        if(head ==null ){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    private void addLast(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode =head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next= newNode;

        
    }
    private void printList() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            
            currNode = currNode.next;
        }
        System.out.println("NULL");
        
    }
    
    void pairWiseSwap()
    {
        Node temp = head;
 
        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) {
 
            /* Swap the data */
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }

    public static void main(String[] args) {
        PairwiseSwap ll = new PairwiseSwap();
        ll.addFirst(2);
        ll.addFirst(98);
        ll.addFirst(17);
        ll.addFirst(19);
        ll.addLast(3);
        ll.addLast(9);
        ll.addFirst(44);
        ll.addLast(16);

        ll.printList();
        System.out.println("After swapping: ");

        ll.pairWiseSwap();
        ll.printList();
    }
}
