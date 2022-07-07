package datastructures.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

  @Test
  void addNode()
  {
    Graph <Integer> sut = new Graph<>();

    assertEquals(1,sut.addNode(1).getValue());
  }

  @Test
  void addEdgeBiDirectional()
  {
  Graph<Integer> sut = new Graph<>();
 Vertex<Integer> v1 = sut.addNode(1);
  Vertex<Integer> v2 = sut.addNode(2);

  sut.addEdgeBiDirectional(v1,v2);

  assertFalse(sut.adjVerts.get(v1).isEmpty());
  assertFalse(sut.adjVerts.get(v2).isEmpty());

  }

  @Test
  void addEdgeUnidirectional()
  {
    Graph<Integer> sut = new Graph<>();
    Vertex<Integer> v1 = sut.addNode(1);
    Vertex<Integer> v2 = sut.addNode(2);

    sut.addEdgeUnidirectional(v1,v2);

    assertFalse(sut.adjVerts.get(v1).isEmpty());
    assertTrue(sut.adjVerts.get(v2).isEmpty());
  }

  @Test
  void addEdgeWeighted()
  {
    Graph<Integer> sut = new Graph<>();
    Vertex<Integer> v1 = sut.addNode(1);
    Vertex<Integer> v2 = sut.addNode(2);

    sut.addEdgeWeighted(v1,v2,22);
    System.out.println(sut.adjVerts.get(v1).get(0).weight);

    assertEquals(22,sut.adjVerts.get(v1).get(0).weight);
    assertEquals(22,sut.adjVerts.get(v2).get(0).weight);
  }

  @Test
  void getNode()
  {
    Graph<Integer> sut = new Graph<>();
    Vertex<Integer> v1 = sut.addNode(1);
    Vertex<Integer> v2 = sut.addNode(2);


    assertTrue(sut.getNode().contains(v1));
    assertTrue(sut.getNode().contains(v2));

  }

  @Test
  void getNeighbours()
  {
    Graph<Integer> sut = new Graph<>();
    Vertex<Integer> v1 = sut.addNode(1);
    Vertex<Integer> v2 = sut.addNode(2);

    assertTrue(sut.getNeighbours(v1).isEmpty());

  }

  @Test
  void size()
  {
    Graph<Integer> sut = new Graph<>();
    Vertex<Integer> v1 = sut.addNode(1);
    Vertex<Integer> v2 = sut.addNode(2);

    assertEquals(2,sut.size());
  }

  @Test
  void BreadthFirst_Traversal()
  {
    Graph<Integer> sut = new Graph<>();
    Vertex<Integer> v1 = sut.addNode(1);
    Vertex<Integer> v2 = sut.addNode(2);
    Vertex<Integer> v3 = sut.addNode(3);
    Vertex<Integer> v4 = sut.addNode(4);


    sut.addEdgeUnidirectional(v1,v3);
    sut.addEdgeUnidirectional(v1,v4);
    sut.addEdgeUnidirectional(v4,v2);

    ArrayList<Integer> compare = new ArrayList<>();
    compare.add(1);
    compare.add(3);
    compare.add(4);
    compare.add(2);


  for (int i = 0; i<compare.size(); i++) {
    assertEquals(compare.get(i), sut.getVertexListBreadthFirst(v1).get(i).value);
  }
  

  }
}
