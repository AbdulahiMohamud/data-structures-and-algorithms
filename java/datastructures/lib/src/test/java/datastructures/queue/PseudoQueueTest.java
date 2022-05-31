package datastructures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PseudoQueueTest {

  @Test
  void EnqeueAddsToPseudoQueue () {
    PseudoQueue<Integer> sut = new PseudoQueue<>();
    sut.enqueue(12);
    sut.enqueue(10);
    assertEquals("[10]->[12]->NULL",sut.toString());
  }

  @Test
  void DequeueRemovesLikeAQueue () {
    PseudoQueue<Integer> sut = new PseudoQueue<>();
    sut.enqueue(10);
    sut.enqueue(20);
    sut.enqueue(30);
    sut.enqueue(40);
    sut.dequeue();
    assertEquals("[40]->[30]->[20]->NULL",sut.toString());


  }

}
