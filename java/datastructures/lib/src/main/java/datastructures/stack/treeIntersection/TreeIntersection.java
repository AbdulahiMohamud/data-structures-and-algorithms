package datastructures.stack.treeIntersection;

import datastructures.hashMap.Hashmap;
import datastructures.trees.BinaryTree;

import java.util.ArrayList;
import java.util.HashSet;

public class TreeIntersection {

  HashSet<Integer> duplicates = new HashSet<>();

  private HashSet<Integer> tree_intersection (BinaryTree<Integer> tree1 , BinaryTree<Integer> tree2) {
    Hashmap<Integer,Integer> hashmap = new Hashmap<>(3);
    ArrayList<Integer> tree1Arr = tree1.preOrder(tree1.root);
    ArrayList<Integer> tree2Arr = tree2.preOrder(tree2.root);

    for (int value : tree1Arr)
    {
      hashmap.set(value,value);
    }
    for (int value: tree2Arr)
    {
      if(hashmap.contains(value))
      {
        duplicates.add(value);
      }
    }
    return duplicates;
  }
}
