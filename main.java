package linkedlist;
public class Main {

    public static void main(String[] args) {
        //Instantiate Empty List 
        LinkedList list = new LinkedList();
        //Generate Nodes
        ListNode ln1 = new ListNode(23423);
        ListNode ln2 = new ListNode(284);
        ListNode ln3 = new ListNode(384);
        ListNode ln4 = new ListNode(9238);
        ListNode ln5 = new ListNode(2384);
        //Link together
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;

        list.setFirstNode(ln1);

        //TODO:Test your functions here:
        
    }
}