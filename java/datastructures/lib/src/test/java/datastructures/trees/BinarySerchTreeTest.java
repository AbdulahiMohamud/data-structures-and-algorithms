package datastructures.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySerchTreeTest {
  @Test
  void addTOTreeInOrder() {
    BinarySerchTree sut = new BinarySerchTree();
    sut.add(1);
    sut.add(2);
    sut.add(3);
    assertEquals("[1, 2, 3]",sut.preOrder(sut.root).toString());
  }

  @Test
  void containsReturnsTrue() {
    BinarySerchTree sut = new BinarySerchTree();
    sut.add(1);
    sut.add(2);
    sut.add(3);
    assertTrue(sut.contains(2));
    assertFalse(sut.contains(23));
    assertTrue(sut.contains(1));
  }

}
