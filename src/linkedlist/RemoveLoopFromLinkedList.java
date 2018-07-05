package linkedlist;

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
        System.out.println(new DetectLoopinLinkedList().detectLoop(head));
    }

    public void removeLoop(Node head) {



    }
}
