package datastructures.stack;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class
StackTest {

  @Test
  void pushSingleIntoStackTest() {
    Stack<Integer> sut = new Stack<>();
    sut.push(1);
    assertEquals("[1]->NULL",sut.toString());
  }
  @Test
  void pushMultipleIntoStackTest() {
    Stack<Integer> sut = new Stack<>();
    sut.push(1);
    sut.push(2);
    sut.push(3);
    assertEquals("[3]->[2]->[1]->NULL",sut.toString());
  }

  @Test
  void popSingleOffStack() {
    Stack<Integer> sut = new Stack<>();
    sut.push(1);
    sut.push(2);
    sut.push(3);
    sut.push(4);
    sut.pop();
    assertEquals("[3]->[2]->[1]->NULL",sut.toString());
  }

  @Test
  void popMultipleOffStackUntilEmpty() {
    Stack<Integer> sut = new Stack<>();
    sut.push(1);
    sut.push(2);
    sut.pop();
    sut.pop();
    assertEquals("NULL",sut.toString());
  }

  @Test
  void peekTopValue() {
    Stack<Integer> sut = new Stack<>();
    sut.push(1);
    assertEquals(1,sut.peek());

  }
  @Test
  void peekReturnsException() {
    Stack<Integer> sut = new Stack<>();
    assertThrows(NoSuchElementException.class, () ->{sut.peek();});

  }

  @Test
  void isEmpty() {
    Stack<String> sut = new Stack<>();
    assertTrue(sut.isEmpty());
  }
}
