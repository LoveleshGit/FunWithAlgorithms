package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveLoopFromLinkedList {

    public static void main(String...args) {
        Node head;
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        head = list.insert(5);
        list.createLoopAtLastKth(2);
        new RemoveLoopFromLinkedList().removeLoop(head);
        list.print();
        System.out.println(new DetectLoopinLinkedList().detectLoop(head));
    }

    public void removeLoop(Node head) {

        Set<Integer> set = new HashSet<Integer>();
        Node temp = head;
        int key;
        while(temp != null && temp.next != null) {
            key = temp.next.data;
            if(set.contains(key)) {
                temp.next=null;
            } else
                set.add(key);
            temp = temp.next;
        }
    }
}
