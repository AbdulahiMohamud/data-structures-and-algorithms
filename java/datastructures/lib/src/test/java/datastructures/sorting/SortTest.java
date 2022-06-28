package datastructures.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

  @Test
  void insertionSort_smallSample_Test()
  {
    Sort sut = new Sort();
    int[] arr = {3,1,2};
    int [] arr2 = {1,2,3};
    assertEquals(arr2[2],sut.insertionSort(arr)[2]);
  }

  @Test
  void insertion_reversed_Sorted()
  {
    Sort sut = new Sort();
    int[] arr = {20,18,12,8,5,-2};
    assertEquals(-2,sut.insertionSort(arr)[0]);
  }

  @Test
  void insertion_few_unique_Sorted()
  {
    Sort sut = new Sort();
    int[] arr = {5,12,7,5,5,7};
    assertEquals(12,sut.insertionSort(arr)[5]);
  }

}
