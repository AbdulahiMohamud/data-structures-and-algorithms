package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{
  @Test void test_empty_list()
  {
    LinkedList sut = new LinkedList();
    assert(sut.head == null);
  }

  @Test void test_insert()
  {
    LinkedList sut = new LinkedList();
    sut.insert(5);
    assert(sut.includes(5));
  }

  @Test void toStringReturnsString()
    {
    Node newNode = new Node(5);
    LinkedList newList = new LinkedList();
    newList.insert(7);
    newList.insert(2);
    assertEquals(newList.toString(), "[7]->[2]->NULL");
  }
}
