package linkedlist;

public class DetectLoopinLinkedList {

    public static void main(String...args) {
        Node head;
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        head = list.insert(5);
        System.out.println(new DetectLoopinLinkedList().detectLoop(head));
    }

    public boolean detectLoop(Node head) {
        Node slow_ptr = head;
        Node fast_ptr = head;
        boolean isLoop=false;

        while(fast_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            if(fast_ptr != null)
                slow_ptr = slow_ptr.next;

            if(slow_ptr == fast_ptr) {
                isLoop=true;
                break;
            }
        }

        if(isLoop == true)
            return true;
        else
            return false;
    }



}
