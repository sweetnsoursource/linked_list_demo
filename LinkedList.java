package linkedlist;

import java.util.Objects;

public class LinkedList{
    private ListNode firstNode;

    public void setFirstNode(ListNode node){
        this.firstNode = node;
    }

    public ListNode getFirstNode(){
        return this.firstNode;
    }
    
    //TODO: exercise for reader
    //Search O(n)
    //Insert O(n)
    //Deletion O(n)

    /* HELPERS */

    private ListNode locateNode(int valueToFind){
        ListNode currNode = this.firstNode;
        while(Objects.nonNull(currNode)){
            if(currNode.getValue() == valueToFind){
                return currNode;
            }
            currNode = currNode.next;
        }
        return null;
    }


}

private class ListNode{
    private ListNode next;
    private int value;

    public void ListNode(int value){
        setValue(value);
    }
    //Overload constructor
    public void ListNode(int value, ListNode next){
        setValue(value);
        setNextNode(next);
    }

    /*SETTERS*/
    public void setValue(int value){
        this.value = value
    }
    public void setNextNode(ListNode node){
        this.next = 
    }
    /*GETTERS */
    public ListNode getNext(){
        return this.next;
    }
    public int getValue(){
        return this.value;
    }
}
