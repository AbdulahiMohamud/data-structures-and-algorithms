package datastructures.graph;

import datastructures.queue.Queue;

import java.util.*;


public class Graph<T> {

  HashMap<Vertex<T>, List<Edge<T>>> adjVerts = new HashMap<>();

  public Graph() {
  }

  public Vertex<T> addNode (T value)
  {
    Vertex<T> newVertex = new Vertex<>(value);
    adjVerts.put(newVertex,new ArrayList<>());
    return newVertex;
  }

  public void addEdgeBiDirectional ( Vertex<T> v1, Vertex<T> v2) {
    if (adjVerts.containsKey(v1) && adjVerts.containsKey(v2))
    {
      adjVerts.get(v1).add(new Edge<>(v2));
      adjVerts.get(v2).add(new Edge<>(v1));
    }

  }

  public void addEdgeUnidirectional (Vertex<T> v1, Vertex<T> v2)
  {
    if(adjVerts.containsKey(v1) && adjVerts.containsKey(v2))
    {
      adjVerts.get(v1).add(new Edge<>(v2));
    }

  }

  public void addEdgeWeighted (Vertex<T> v1,Vertex<T> v2, int weight)
  {
    if(adjVerts.containsKey(v1) && adjVerts.containsKey(v2))
    {
      adjVerts.get(v1).add(new Edge<>(v2,weight));
      adjVerts.get(v2).add(new Edge<>(v1,weight));
    }

  }

  public Set<Vertex<T>> getNode ()
  {
    return adjVerts.keySet();
  }

  public List<Edge<T>> getNeighbours(Vertex<T> v)
  {
    return adjVerts.get(v);
  }

  public int size ()
  {
    return adjVerts.size();
  }


  public List<Vertex<T>> getVertexListBreadthFirst(Vertex<T> ver)
  {
    HashSet<T> set = new HashSet<>();
    List<Vertex<T>> vertexList = new ArrayList<>();
    Queue<Vertex<T>> queue = new Queue<>();

    set.add(ver.value);
    queue.enqueue(ver);

    while (!queue.isEmpty())
    {
      Vertex<T> current = queue.dequeue();
      vertexList.add(current);


      for (Edge<T> edge : getNeighbours(current))
      {

        if(!set.contains(edge.neighbour.value))
        {
          queue.enqueue(edge.neighbour);
          set.add(edge.neighbour.value);
        }

      }

    }
      return vertexList;
  }




}
