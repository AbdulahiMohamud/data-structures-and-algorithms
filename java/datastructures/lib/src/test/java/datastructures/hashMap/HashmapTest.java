package datastructures.hashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashmapTest {

  @Test
  void set()
  {
    Hashmap<Integer,Integer> sut = new Hashmap<>(2);
    sut.set(1,2);
    assertEquals(sut.get(1),2);

  }

  @Test
  void get() {
    Hashmap<Integer,Integer> sut = new Hashmap<>(2);
    sut.set(1,2);
    assertEquals(sut.get(1),2);
  }

  @Test
  void contains() {
    Hashmap<String,Integer> sut = new Hashmap<>(12);
    sut.set("test",2);
    assertTrue(sut.contains("test"));
  }

  @Test
  void keys() {
    Hashmap<Integer,Integer> sut =new Hashmap<>(12);
    sut.set(1,2);
    sut.set(3,4);
    assertEquals(sut.keys().size(),2);

  }

  @Test
  void repetedWords_shortString_Test()
  {
    Hashmap<String,Integer> sut = new Hashmap<>();
    String test = "Hi ,hello my name is hello.";
    assertEquals("hello",sut.repetedWord(test));
  }

  @Test
  void repetedWords_NotNull_Test()
  {
    Hashmap<String,Integer> sut = new Hashmap<>();
    String test = "Hi ,hello, my name is ,hello,.";
    assertEquals("hello",sut.repetedWord(test));
    assertNotEquals("Hi",sut.repetedWord(test));
  }

  @Test
  void repetedWords_Summer_Test()
  {
    Hashmap<String,Integer> sut = new Hashmap<>();
    String test = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
    assertEquals("summer",sut.repetedWord(test));

  }

  @Test
  void repetedWords_it_Test()
  {
    Hashmap<String,Integer> sut = new Hashmap<>();
    String test = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
    assertEquals("it",sut.repetedWord(test));
  }

  @Test
  void repetedWords_a_Test()
  {
    Hashmap<String,Integer> sut = new Hashmap<>();
    String test = "Once upon a time, there was a brave princess who...";
    assertEquals("a",sut.repetedWord(test));
  }


}
