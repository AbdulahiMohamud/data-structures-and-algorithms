package datastructures.linkedlist;

public class LinkedList
{
  Node head = null;
  Node tail = null;

  public void insert(int value) {
    Node insertNode = new Node(value);
    if (head != null) {
      insertNode.next = head;
    }
    head = insertNode;

  }
  public boolean includes(int value) {
    if( head == null) return false;
    Node currentNode = head;
    while(currentNode != null){
      if(currentNode.value== value){
        return true;
      }
      currentNode =currentNode.next;
    }
    return false;
  }
  @Override
  public String toString(){
    String message = "NULL";
    if(head == null) {
      return message;
    }
    Node currentNode = head;
    while(currentNode != null){
      message = "[" + currentNode.value + "]->" + message;
      currentNode = currentNode.next;
    }
    return message;
  }
}
