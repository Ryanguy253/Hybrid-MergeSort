# Hybrid MergeSort

In Mergesort, when the sizes of subarrays are small, the overhead of many recursive 
calls makes the algorithm inefficient. Therefore, in real use, we often combine 
Mergesort with Insertion Sort to come up with a hybrid sorting algorithm for better 
efficiency. The idea is to set a small integer S as a threshold for the size of subarrays. 
Once the size of a subarray in a recursive call of Mergesort is less than or equal to S, 
the algorithm will switch to Insertion Sort, which is efficient for small-sized input.

In this project, the time complexity of this hybrid algorithm will be analysed and compared 
with the original mergesort.
