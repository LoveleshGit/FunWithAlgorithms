package linkedlist;

public class FindMiddleElement extends LinkedList{

    public static void main(String...args) {

        Node head;
        FindMiddleElement obj = new FindMiddleElement();
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        head = list.insert(4);
        head = list.insert(5);
        list.print();
        System.out.println(obj.findMiddle(head));

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
}
