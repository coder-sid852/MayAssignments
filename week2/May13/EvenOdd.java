package MayAssignment.week2.May13;

public class EvenOdd {
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
    void placeEvenOdd()
    {
        Node end = head;
        Node prev = null;
        Node curr = head;
        while (end.next != null)
            end = end.next;
 
        Node new_end = end;
        while (curr.data %2 !=0 && curr != end)
        {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }
        if (curr.data %2 ==0)
        {
            head = curr;
            while (curr != end)
            {
                if (curr.data % 2 == 0)
                {
                    prev = curr;
                    curr = curr.next;
                }
                else
                {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        }
 
        else prev = curr;
 
        if (new_end != end && end.data %2 != 0)
        {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }
    
    public static void main(String[] args) {
        EvenOdd ll = new EvenOdd();
        ll.addFirst(2);
        ll.addFirst(98);
        ll.addFirst(17);
        ll.addFirst(19);
        ll.addLast(3);
        ll.addLast(9);
        ll.addFirst(44);
        ll.addLast(16);

        ll.printList();
        System.out.println("After Segretaing Even Odds: ");

        ll.placeEvenOdd();
        ll.printList();
    }
}
