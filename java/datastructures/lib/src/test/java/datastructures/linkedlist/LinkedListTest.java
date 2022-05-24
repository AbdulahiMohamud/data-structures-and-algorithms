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
  @Test void test_append()
  {
    LinkedList sut = new LinkedList();
    sut.append(12);
    assert(sut.includes(12));
  }

  @Test
  void insertBefore_test() {
    LinkedList newList = new LinkedList();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);
    newList.insertBefore(3,1);
    assertEquals("[3]->[2]->[3]->[1]->NULL", newList.toString());
  }

  @Test
  void insertAfterReturnsUpdatedList() {
    LinkedList newList = new LinkedList();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);
    newList.insertAfter(3,2);
    assertEquals("[3]->[2]->[3]->[1]->NULL", newList.toString());
  }

}
