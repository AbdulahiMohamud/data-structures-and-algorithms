package datastructures.trees;
// Referenced from Rodger Reyes https://github.com/RogerMReyes


public class KaryTree<T> {
  private KaryNode<T> root;

  public KaryTree() {
  }

  public KaryTree(KaryNode<T> root) {
    this.root = root;
  }

  public KaryTree<KaryNode<String>> fizzBuzzTree(KaryTree<KaryNode<Integer>> tree){
    if(tree == null) throw new IllegalArgumentException();
    KaryTree<KaryNode<String>> newTree = new KaryTree<>();
    newTree.setRoot(fizzBuzzRecursion(tree.getRoot()));
    return newTree;
  }

  public KaryNode<String> fizzBuzzRecursion(KaryNode<Integer> node){
    KaryNode<String> temp = new KaryNode<>();
    if(node.getChildList().isEmpty()){
      temp.setValue(checkFizzBuzz(node));
    }
    else{
      for(KaryNode<Integer> child : node.getChildList()){
        temp.getChildList().add(fizzBuzzRecursion(child));
      }
      temp.setValue(checkFizzBuzz(node));
    }
    return temp;
  }


  public String checkFizzBuzz(KaryNode<Integer> node){
    if(node.getValue() % 3 == 0 && node.getValue() % 5 == 0){
      return "FizzBuzz";
    }
    else if(node.getValue() % 3 == 0){
      return "Fizz";
    }
    else if (node.getValue() % 5 == 0){
      return "Buzz";
    }
    else {
      return Integer.toString(node.getValue());
    }
  }

  public KaryNode getRoot() {
    return root;
  }

  public void setRoot(KaryNode root) {
    this.root = root;
  }
}
