package datastructures.animalshelter;

import datastructures.linkedlist.Node;
import datastructures.queue.Queue;

import java.util.NoSuchElementException;

public class AnimalShelter<T> {

  Queue<Animal> shelter = new Queue<>();

  public AnimalShelter() {
  }

  public void enqueue (Animal animal) {
    shelter.enqueue(animal);
  }


  public Queue<Animal> getShelter() {
    return shelter;
  }

  public Animal dequeue(String pref){
    if(shelter.isEmpty()){
      throw new IllegalArgumentException("Queue is Empty");
    }
    if(shelter.getFront().value.getPet() == pref){
      return shelter.dequeue();
    }
    // assigning the reference
    Node<Animal> curr = shelter.getFront();
    Node<Animal> checker = curr.next;
    // iterating if value is not equal to pref and if the checker node is not null
    while(checker.value.getPet() != pref && checker != null){
      // assigns the node to the next one.
      checker = checker.next;
      curr = curr.next;
    }
    if(checker == null) {
      // returning null when pref is not found in the queue
      return null;
    }
    else {
      // reassign the references back to original flow.
      curr.next = checker.next;
      checker.next = null;
      return checker.value;
    }


  }


}
