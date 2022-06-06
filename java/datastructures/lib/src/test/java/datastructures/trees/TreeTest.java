package datastructures.trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

  @Test
  void preOrderTest() {
    BinaryTree<Integer> sut = new BinaryTree<>();
    Node<Integer> newNode5 = new Node<>(1);
    Node<Integer> newNode4 = new Node<>(2);
    Node<Integer> newNode3 = new Node<>(3);
    sut.root = newNode5;
    sut.root.setRight(newNode3);
    sut.root.setLeft(newNode4);

    ArrayList<Integer> results = sut.preOrder(sut.root);

    assertEquals("[1, 2, 3]",results.toString());
  }
  @Test
  void inOrderTest() {
    BinaryTree<Integer> sut = new BinaryTree<>();
    Node<Integer> newNode5 = new Node<>(1);
    Node<Integer> newNode4 = new Node<>(2);
    Node<Integer> newNode3 = new Node<>(3);
    sut.root = newNode5;
    sut.root.setRight(newNode3);
    sut.root.setLeft(newNode4);

    ArrayList<Integer> results = sut.inOrder(sut.root);

    assertEquals("[2, 1, 3]",results.toString());
  }

  @Test
  void postOrderTest() {
    BinaryTree<Integer> sut = new BinaryTree<>();
    Node<Integer> newNode5 = new Node<>(1);
    Node<Integer> newNode4 = new Node<>(2);
    Node<Integer> newNode3 = new Node<>(3);
    sut.root = newNode5;
    sut.root.setRight(newNode3);
    sut.root.setLeft(newNode4);

    ArrayList<Integer> results = sut.postOrder(sut.root);

    assertEquals("[2, 3, 1]",results.toString());
  }
  @Test
  void maxValueOfTree()
  {
    BinaryTree<Integer> sut = new BinaryTree<>();
    Node<Integer> newNode5 = new Node<>(130);
    Node<Integer> newNode4 = new Node<>(29);
    Node<Integer> newNode3 = new Node<>(20);
    sut.root = newNode5;
    sut.root.setRight(newNode3);
    sut.root.setLeft(newNode4);

    assertEquals(130, sut.maxValue());
  }

}
