package datastructures.stack;

import datastructures.linkedlist.Node;

public class Stack <T>{

  Node<T> top = null;

  int count;


  public void push (T value){
    Node<T> newNode = new Node<>(value);
    if(top != null) {
      newNode.next = top;
    }
    top = newNode;
  }

  public T pop(){
    Node<T> temp = top;
    top = top.next;
    temp.next = null;

    return temp.value;
  }

  public T peek(){
    return top.value;
  }

  public boolean isEmpty()
  {
    return (top == null);
  }


  @Override
  public String toString() {
    Node<T> walker = top;
    StringBuilder string = new StringBuilder();
    while(walker != null){
      string.append("[");
      string.append(walker.value);
      string.append("]->");
      walker = walker.next;
    }
    string.append("NULL");
    return string.toString();
  }


}
