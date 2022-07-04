package datastructures.graph;

import org.junit.jupiter.api.Test;

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
}
