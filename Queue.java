
package datastructure;

public class Queue {
   private ListNode front;
   private ListNode rear;
   private int length;
   
   public Queue() {
    front =null;
    rear=null;
    length=0;
    }
   private class ListNode{
       private int data;
       private ListNode next;
       
       public ListNode(int data){
           this.data=data;
           this.next=null;
       }
   }
   public int length(){
       return length;
   }
   public boolean isEmpty(){
       return length==0;
   }
   public void enqueue(int data){
       
   }
   
}
