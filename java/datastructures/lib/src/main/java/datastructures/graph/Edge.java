package datastructures.graph;

public class Edge<T> {
  Vertex<T> neighbour;
  int weight;

  public Edge(Vertex<T> neighbour) {
    this.neighbour = neighbour;
  }

  public Edge(Vertex<T> neighbour, int weight) {
    this.neighbour = neighbour;
    this.weight = weight;
  }

  public Vertex<T> getNeighbour() {
    return neighbour;
  }

  public void setNeighbour(Vertex<T> neighbour) {
    this.neighbour = neighbour;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}
