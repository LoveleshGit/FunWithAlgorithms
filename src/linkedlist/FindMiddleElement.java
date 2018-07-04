package linkedlist;

public class FindMiddleElement {

    public static void main(String...args) {

        Node list = new Node();
        FindMiddleElement obj = new FindMiddleElement();
        obj.insert(list,1);
        obj.insert(list,2);
        obj.insert(list,3);
        obj.insert(list,4);
        obj.insert(list,5);
        obj.print(list);
        System.out.println(obj.findMiddle(list));

    }

    public int findMiddle(Node head) {

        Node tortoise = head.next;
        Node hare = head.next;

        while(hare != null && hare.next != null) {
            hare = hare.next.next;
            if(hare != null)
                tortoise = tortoise.next;
        }
        return tortoise.data;
    }

    public void insert(Node head,int data) {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node();
        temp.next.data = data;
    }

    public void print(Node head) {
        Node temp = head.next;

        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node {
        int data;
        Node next;
    }
}
