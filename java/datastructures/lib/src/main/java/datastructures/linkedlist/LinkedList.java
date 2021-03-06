package datastructures.linkedlist;

public class LinkedList<T>
{
  Node<T> head = null;
  Node<T> tail = null;
  int count;

  public void insert(T value) {
    Node<T> newNode = new Node<>(value);
    count++;
    if (head != null) {
      newNode.next = head;
    }
    if(head == null){
      tail = newNode;
    }
    head = newNode;
  }


  public boolean includes(T value) {
    if( head == null) return false;
    Node<T> currentNode = head;
    while(currentNode != null){
      if(currentNode.value== value){
        return true;
      }
      currentNode =currentNode.next;
    }
    return false;
  }

  public void append (T value) {
    Node<T> newNode = new Node<> (value);
    if (head != null) {
      Node<T> current;
      current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    } else {
      head = newNode;
    }
    count++;
  }
  public void insertBefore (T value , T target) {
    Node<T> newNode = new Node<>(value);
    Node<T> current = head;
    Node<T> pre = null;
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
    count++;
    }
  public void insertAfter(T value, T target){
    Node<T> newNode = new Node<>(value);
    Node<T> current = head;
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
    count++;
  }

  public T kthFromEnd(int k){
    int target = count - k;
    Node<T> current = head;
    for(int i = 0; i < target; i++){
      if(i == target - 1){
        return current.value;
      }
      if(k >= count || k < 0){
        throw new IllegalArgumentException("position " + k + " is not on the list");
      }
      current = current.next;
    }
    throw new IllegalArgumentException("position " + k + " is not on the list");
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

  public boolean zipList (LinkedList<T> otherList){
    try {
      Node<T> tempAlpha = this.head;
      Node<T> tempBravo = otherList.head;
      Node<T> tempCharlie = this.head.next;

      while (tempAlpha.next != null){
        tempCharlie = tempAlpha.next;

        tempAlpha.next = tempBravo;
        otherList.head = otherList.head.next;
        tempBravo.next = tempCharlie;
        tempBravo = otherList.head;
        tempAlpha = tempCharlie;

      }
      tempAlpha.next = tempBravo;

    }catch (Exception ex){
      System.out.println("something went wrong: " + ex.getMessage());
      return false;

    }

  return true;
}

  public Node<T> getHead() {
    return head;
  }

  public void setHead(Node<T> head) {
    this.head = head;
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
