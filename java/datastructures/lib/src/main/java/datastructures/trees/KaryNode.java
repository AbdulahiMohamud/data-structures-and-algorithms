package datastructures.trees;

import java.util.ArrayList;

public class KaryNode <T>{

  T value;
  ArrayList<KaryNode<T>> childList;

  public KaryNode() {

  }

  public KaryNode(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public ArrayList<KaryNode<T>> getChildList() {
    return childList;
  }

  public void setChildList(ArrayList<KaryNode<T>> childList) {
    this.childList = childList;
  }
}
