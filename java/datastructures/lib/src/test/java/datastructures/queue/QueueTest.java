package datastructures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

  @Test
  void enqueueaddsNode() {
    Queue<Integer> sut = new Queue<>();
    sut.enqueue(4);
    assertEquals("[4]->NULL", sut.toString());
  }
  @Test
  void enqueueaddsMultiplyNodes() {
    Queue<Integer> sut = new Queue<>();
    sut.enqueue(2);
    sut.enqueue(6);
    assertEquals("[6]->[2]->NULL", sut.toString());
  }

  @Test
  void dequeueRemovesFromFont() {
    Queue<Integer> sut = new Queue<>();
    sut.enqueue(5);
    sut.enqueue(4);
    assertEquals(4, sut.dequeue());
    assertEquals("[5]->NULL",sut.toString());
  }
  @Test
  void dequeueRemovesMultipltFromFont() {
    Queue<Integer> sut = new Queue<>();
    sut.enqueue(5);
    sut.enqueue(4);
    sut.enqueue(4);
    sut.dequeue();
    sut.dequeue();
    assertEquals("[5]->NULL",sut.toString());
  }

  @Test
  void peekShowsFrontValue() {
    Queue<Integer> sut = new Queue<>();
    sut.enqueue(4);
    assertEquals(4,sut.peek());
  }

  @Test
  void isEmptyTrueIfEmpty() {
    Queue<Integer> sut = new Queue<>();
    assertTrue(sut.isEmpty());
  }
}
