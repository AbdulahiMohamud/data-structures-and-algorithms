package datastructures.trees;

import java.util.ArrayList;

public class BinaryTree<T> {

  public Node<T> root;
  ArrayList<T> data = new ArrayList<>();


  public BinaryTree() {
  }


  public ArrayList<T> preOrder (Node<T> node){
    data.add(node.getValue());
    if(node.getLeft() != null){
      preOrder(node.getLeft());
    }
    if(node.getRight() != null){
      preOrder(node.getRight());
    }
    return data;
  }

  public ArrayList<T> inOrder (Node<T> node) {
    if(node.getLeft() != null){
      inOrder(node.getLeft());
    }
    data.add(node.getValue());
    if(node.getRight() != null){
      inOrder(node.getRight());
    }
    return data;
  }


  public ArrayList<T> postOrder (Node<T> node) {
    if(node != null) {
      if (node.getLeft() != null) {
        postOrder(node.getLeft());
      }
      if (node.getRight() != null) {
        postOrder(node.getRight());
      }
      data.add(node.getValue());
    }
    return data;

  }



}

