package datastructures.animalshelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AnimalShelterTest {

  @Test
    void enqueueAddsAnimalToShelter() {
      AnimalShelter<Animal> sut = new AnimalShelter();
      Animal dog = new Animal("dog");
      sut.enqueue(dog);

    assertEquals("dog",sut.getShelter().peek().getPet());

    }

  @Test
  void dequeueRemovesDogFromShelter() {
    AnimalShelter<Animal> sut = new AnimalShelter();
    Animal dog = new Animal("dog");
    Animal cat = new Animal("cat");
    sut.enqueue(dog);
    sut.enqueue(cat);

    assertEquals("dog",sut.dequeue("dog").getPet());

  }

  @Test
  void dequeueRemovesCatFromShelter() {
    AnimalShelter<Animal> sut = new AnimalShelter();
    Animal dog = new Animal("dog");
    Animal cat = new Animal("cat");
    sut.enqueue(dog);
    sut.enqueue(cat);

    assertEquals("cat",sut.dequeue("cat").getPet());

  }
}
