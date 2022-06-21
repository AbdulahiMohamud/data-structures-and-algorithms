package datastructures.hashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashtableTest {

  @Test
  void set()
  {
    Hashtable<Integer,Integer> sut = new Hashtable<>(2);
    sut.set(1,2);
    assertEquals(sut.get(1),2);

  }

  @Test
  void get() {
    Hashtable<Integer,Integer> sut = new Hashtable<>(2);
    sut.set(1,2);
    assertEquals(sut.get(1),2);
  }

  @Test
  void contains() {
    Hashtable<String,Integer> sut = new Hashtable<>(12);
    sut.set("test",2);
    assertTrue(sut.contains("test"));
  }

  @Test
  void keys() {
    Hashtable<Integer,Integer> sut =new Hashtable<>(12);
    sut.set(1,2);
    sut.set(3,4);
    assertEquals(sut.keys().size(),2);

  }


}
