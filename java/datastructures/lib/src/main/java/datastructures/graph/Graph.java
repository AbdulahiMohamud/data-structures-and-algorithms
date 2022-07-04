package datastructures.graph;

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




}
