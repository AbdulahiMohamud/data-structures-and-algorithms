package datastructures.linkedlist;

public class LinkedList
{
  Node head = null;
  Node tail = null;

  public void insert(int value) {
    Node newNode = new Node(value);
    if (head != null) {
      newNode.next = head;
    }
    if(head == null){
      tail = newNode;
    }
    head = newNode;
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

  public void append (int value) {
    Node newNode = new Node (value);
    if (head != null) {
      Node current;
      current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    } else {
      head = newNode;
    }
  }
  public void insertBefore (int value , int target) {
    Node newNode = new Node(value);
    Node current = head;
    Node pre = null;
    while (current.value != target) {
      pre = current;
      current = current.next;
    }
    newNode.next = current;
    if(pre != null){
      pre.next = newNode;
    }else  {
      head = newNode;
    }
    }
  public void insertAfter(int value, int target){
    Node newNode = new Node(value);
    Node current = head;
    while(current != null){
      if(current.value == target){
        newNode.next = current.next;
        current.next = newNode;
        if(newNode.next == null){
          tail = newNode;
        }
      }
      current = current.next;
    }
  }


  // Roger toString the wrong way
  @Override
  public String toString(){
    String response = "";
    if(head == null) {
      return "NULL";
    }
    Node currentNode = head;
    while(currentNode != null){
      response = response + "[" + currentNode.value + "]->";
      currentNode = currentNode.next;
    }
    response += "NULL";
    return response;
  }


//  @Override
//  public String toString(){
//    String message = "NULL";
//    if(head == null) {
//      return message;
//    }
//    Node currentNode = head;
//    while(currentNode != null){
//      message = "[" + currentNode.value + "]->" + message;
//      currentNode = currentNode.next;
//    }
//    return message;
//  }
}
