# Merge  Sort

- - Merge Sort is a divide and conquer sorting algorithm.
- It works by recursively dividing the problem into two or more sub-problems of the same or related type until they become simple enough to be solved.
- The solutions to the sub-problems are then reassembled to return a solution to the original problem.
- We'll be using an array  we'll start by breaking down that array into equals parts, then combine those sub-arrays in a sorted manner.

````Java
//ALGORITHM Mergesort(arr)
    //DECLARE n <-- arr.length

   //if n > 1
      //DECLARE mid <-- n/2
     // DECLARE left <-- arr[0...mid]
     // DECLARE right <-- arr[mid...n]
      // sort the left side
     // Mergesort(left)
      // sort the right side
      //Mergesort(right)
      // merge the sorted left and right sides together
     // Merge(left, right, arr)

//ALGORITHM Merge(left, right, arr)
    //DECLARE i <-- 0
    //DECLARE j <-- 0
   // DECLARE k <-- 0

   // while i < left.length && j < right.length
      //  if left[i] <= right[j]
           // arr[k] <-- left[i]
           // i <-- i + 1
     //   else
           // arr[k] <-- right[j]
          //  j <-- j + 1

       // k <-- k + 1

    // if i = left.length
       // set remaining entries in arr to remaining values in right
   //  else
      // set remaining entries in arr to remaining values in left

````

- In this example you can see that an array is split in half and each half is sorted. After each side is sorted the
  then the two sides are merged together. At first glance in the small scale, you might ask why not just do insertion sort.
  The following example begins to display when arrays start to get larger, and why it is more efficient than insertion sort.
- In this example imagine trying to do the sort on a larger array and imagine doing an insertion sort one array with
  all the following values. You would be waiting around longer as it scales in the worst case scenario.

- ![merge sort](img/mergesort.jpg)

- The Big O notation time complexity of insertion sort is O (n ^ 2)
The time complexity of merge sort is O (n log (n))
