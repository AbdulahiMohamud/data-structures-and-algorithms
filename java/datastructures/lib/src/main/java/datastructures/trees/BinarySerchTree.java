package datastructures.trees;

public class BinarySerchTree extends BinaryTree<Integer> {


  public void add (int value){
    root = addRecursion(root, value);


  }
  public Node<Integer> addRecursion(Node<Integer> node, int value) {
    if( node == null){
      return new Node<>(value);
    }
    if(node.getValue() > value){
      node.setLeft(addRecursion(node.getLeft(),value));
    }
    else if(node.getValue() < value){
      node.setRight(addRecursion(node.getRight(),value));
    }
    else {
      return node;
    }

    return node;

  }

  public boolean contains (int value){
    return serchRer(root,value);

  }

  public boolean serchRer (Node<Integer> node, int value){
    if( node == null){
      return false;
    }
    if(node.getValue() > value){
      return serchRer(node.getLeft(),value);
    }
    else if(node.getValue() < value){
      return serchRer(node.getRight(),value);
    }
    else {
      return node.getValue() == value;
    }

}


}
