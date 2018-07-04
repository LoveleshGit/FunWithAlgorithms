package linkedlist;

public class LinkedList {
    Node head;

    public LinkedList() {
        head = new Node();
    }

    public Node insert(int data) {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node();
        temp.next.data = data;
        return head;
    }

    public void print() {
        Node temp = head.next;

        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void createLoopAtLastKth(int lastKth) {
        Node temp = head;
        Node loopNode=head;
        while(temp.next != null) {
            temp = temp.next;
            lastKth--;
            if(lastKth<=0) {
                loopNode = loopNode.next;
            }
        }
        temp.next = loopNode;
    }
}
