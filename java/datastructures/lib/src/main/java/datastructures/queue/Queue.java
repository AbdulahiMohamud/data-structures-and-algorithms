package datastructures.queue;


import datastructures.linkedlist.Node;
import java.util.NoSuchElementException;

public class Queue<T>
{
  Node<T> front;
  Node<T> rear;

  public void enqueue(T value)
  {
    Node<T> newNode = new Node<>(value);
    if (front != null) {
      newNode.next = front;
    }
    front = newNode;
  }

  public T dequeue()
  {
    Node<T> temp = front;
    front = front.next;
    temp.next = null;

    return temp.value;
  }

  public T peek()
  {
    if (front == null){
      throw new NoSuchElementException("Queue is empty");
    }
    return front.value;
  }


  public boolean isEmpty()
  {
    return ( front == null);
  }


  @Override
  public String toString() {
    Node<T> walker = front;
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

  public Node<T> getFront() {
    return front;
  }

  public Node<T> getRear() {
    return rear;
  }
}
