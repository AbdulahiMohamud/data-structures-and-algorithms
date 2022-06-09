package datastructures.trees;

// Referenced from Rodger Reyes https://github.com/RogerMReyes



import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KaryTreeTest {
  @Test
  void fizzBuzzTest() {
    KaryTree<KaryNode<Integer>> sut = new KaryTree<>();
    KaryNode<Integer> sut1 = new KaryNode<>(1);
    KaryNode<Integer> sut2 = new KaryNode<>(2);
    KaryNode<Integer> sut3 = new KaryNode<>(3);
    KaryNode<Integer> sut4 = new KaryNode<>(4);
    KaryNode<Integer> sut5 = new KaryNode<>(5);
    sut.setRoot(sut1);
    sut1.getChildList().add(sut2);
    sut1.getChildList().add(sut3);
    sut2.getChildList().add(sut4);
    sut3.getChildList().add(sut5);
    KaryTree<KaryNode<String>> newSut = sut.fizzBuzzTree(sut);
    ArrayList<KaryNode<String>> test = newSut.getRoot().getChildList();
    System.out.println(test);
//    assertEquals("Fizz", test.get(1).getValue());
  }

}
