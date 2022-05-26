package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
  @Test
  void test_empty_list() {
    LinkedList sut = new LinkedList();
    assert (sut.head == null);
  }

  @Test
  void test_insert() {
    LinkedList sut = new LinkedList();
    sut.insert(5);
    assert (sut.includes(5));
  }

  @Test
  void toStringReturnsString() {
    Node newNode = new Node(5);
    LinkedList newList = new LinkedList();
    newList.insert(7);
    newList.insert(2);
    assertEquals(newList.toString(), "[2]->[7]->NULL");
  }

  @Test
  void test_append() {
    LinkedList sut = new LinkedList();
    sut.append(12);
    assert (sut.includes(12));
  }

  @Test
  void insertBefore_test() {
    LinkedList newList = new LinkedList();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);
    newList.insertBefore(3, 1);
    assertEquals("[3]->[2]->[3]->[1]->NULL", newList.toString());
  }

  @Test
  void insertAfterReturnsUpdatedList() {
    LinkedList newList = new LinkedList();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);
    newList.insertAfter(3, 2);
    assertEquals("[3]->[2]->[3]->[1]->NULL", newList.toString());
  }

  @Test
  void kthfromend_happypath_Test() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.append(0);
    sut.append(1);
    sut.append(2);
    sut.append(3);
    assert(sut.kthFromEnd(2) == 1);
  }
  @Test
  void test_kthfromend_too_large_k() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.append(1);
    sut.append(2);
    sut.append(3);
    assertThrows(IllegalArgumentException.class, () -> {
      sut.kthFromEnd(4);
    });
  }

  @Test
  void kthfromend_samelength_test() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.append(1);
    sut.append(2);
    sut.append(3);
    assertThrows(IllegalArgumentException.class, () -> {
      sut.kthFromEnd(3);
    });
  }

  @Test
  void kthfromend_negative_test() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.append(1);
    sut.append(2);
    sut.append(3);
    assertThrows(IllegalArgumentException.class, () -> {
      sut.kthFromEnd(-2);
    });
  }

  @Test
  void kthfromend_listsizeOf_One_test() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.append(12);
    assert(sut.kthFromEnd(0) == 12);
  }
  @Test
  void zipListMethodretuensTrue()
  {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.append(1);
    sut.append(2);
    sut.append(3);
    assertTrue(sut.zipList(sut));
  }
  @Test
  void zipListMethodThrows()
  {
    LinkedList<Integer> sut = new LinkedList<>();
    assertFalse(sut.zipList(sut));
  }

  @Test
  void zipListMethodlongerShorterReturnsTrueandLinkList()
  {
    LinkedList<Integer> sut = new LinkedList<>();
    LinkedList<Integer> other = new LinkedList<>();
    other.append(20);
    other.append(10);
    sut.append(1);
    sut.append(2);
    sut.append(3);
    assertTrue(sut.zipList(other));
    assertEquals("[1]->[20]->[2]->[10]->[3]->NULL",sut.toString());
  }
  @Test
  void zipListMethodShorterLongerReturnsTrue()
  {
    LinkedList<Integer> sut = new LinkedList<>();
    LinkedList<Integer> other = new LinkedList<>();
    other.append(1);
    other.append(2);
    other.append(1);
    sut.append(2);
    sut.append(3);
    assertTrue(sut.zipList(other));
  }



}

