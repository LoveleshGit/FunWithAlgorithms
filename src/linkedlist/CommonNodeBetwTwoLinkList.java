package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class CommonNodeBetwTwoLinkList {

    public static void main(String...args) {

        /**Here two linked list are created with 7 as common node
         * between them. FindCommon method finds that common node
         */

        Node n1 = new Node();
        n1.data = 1;
        Node n2 = new Node();
        n2.data = 2;
        Node n3 = new Node();
        n3.data = 3;
        Node n4 = new Node();
        n4.data = 4;
        Node n5 = new Node();
        n5.data = 5;
        Node n6 = new Node();
        n6.data = 6;
        Node n7 = new Node();
        n7.data = 7;
        Node n8 = new Node();
        n8.data = 8;
        Node n9 = new Node();
        n9.data = 5;
        Node n10 = new Node();
        n10.data = 6;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        n9.next = n10;
        n10.next = n7;

        Node head1 = new Node();
        head1.next = n1;
        Node head2 = new Node();
        head2.next = n9;

        LinkedList list = new LinkedList();
        list.setHead(head1);
        list.print();

        LinkedList list2 = new LinkedList();
        list2.setHead(head2);
        list2.print();
        new CommonNodeBetwTwoLinkList().find_Common_Node(head1,head2);
    }

    public void find_Common_Node(Node head1,Node head2) {

        Set<Integer> hashCodeSet  = new HashSet<Integer>();
        Node temp = head1;

        while(temp != null) {
            hashCodeSet.add(temp.hashCode());
            temp = temp.next;
        }

        temp = head2;
        int hashCode;
        while(temp != null) {
            hashCode = temp.hashCode();
            if(hashCodeSet.contains(hashCode)) {
                System.out.println("Common Node is : "+temp.data);
                break;
            }
            temp = temp.next;
        }
    }
}
