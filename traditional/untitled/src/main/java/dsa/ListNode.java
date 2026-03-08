package main.java.dsa;

public class ListNode {


     int val;
    ListNode next;


    public ListNode(){

    }
    public ListNode(int val){
        this.val=val;
    }

    public ListNode(int val, ListNode node1){
        this.val=val;
        this.next=node1;
    }

}
