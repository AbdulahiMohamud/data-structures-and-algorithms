package datastructures.queue;

import datastructures.linkedlist.Node;
import datastructures.stack.Stack;

public class PseudoQueue<T> {
  public Stack<T> back = new Stack<>();
  public Stack<T> front = new Stack<>();

  PseudoQueue() {

  }

  T dequeue() {
    while(!back.isEmpty()) {
      front.push(back.pop());
    }
    T temp =  front.pop();
while(!front.isEmpty()){
back.push(front.pop());
    }
return temp;
  }

  void enqueue(T value) {
    back.push(value);
  }

  @Override
  public String toString() {
    Node<T> walker = back.getTop();
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

