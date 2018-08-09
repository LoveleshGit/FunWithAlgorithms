package linkedlist;

public class ReverseALinkedList {

    public static void main(String...args) {
        Node head;
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.print();
        LinkedList newList = new ReverseALinkedList().reverseLinkedList(list);
        newList.print();
    }

    public LinkedList reverseLinkedList(LinkedList list) {
        Node head = list.getHead();

        if(head == null)
            return list;
        Node prev_node = null;
        Node curr_node = head.next;
        Node next_node = null;

        while(curr_node != null) {
            next_node = curr_node.next;
            curr_node.next = prev_node;
            prev_node = curr_node;
            curr_node = next_node;
        }
        list.setHead(prev_node);
        return list;
    }
}
