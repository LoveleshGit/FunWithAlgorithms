package linkedlist;

/**
 * This class removes duplicate elements from sorted linked list
 * @author lovelesh
 */
public class RemoveDuplicate {

    public static void main(String...args) {
        LinkedList list = new LinkedList();
        list.insert(11);
        list.insert(11);
        list.insert(11);
        list.insert(21);
        list.insert(43);
        list.insert(43);
        Node head = list.insert(60);
        list.print();
        new RemoveDuplicate().removeDuplicates(head);
        list.print();

    }

    public void removeDuplicates(Node head) {
        Node temp = head.next;
        if(temp.next == null)
            return;
        int prev_num=0;

        while(temp.next != null) {
            prev_num = temp.data;
            if(temp.next.data == prev_num) {
                temp.next = temp.next.next;
            } else
            temp = temp.next;
        }

    }
}