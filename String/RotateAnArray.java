Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements, without allocating extra space

For instance, with k = 3, the array [1, 2, 3, 4, 5, 6, 7] is rotated to [3, 4, 5, 6, 7, 1, 2]

// METHOD 1 (Use temp array)

// Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
// 1) Store d elements in a temp array
//    temp[] = [1, 2]
// 2) Shift rest of the arr[]
//    arr[] = [3, 4, 5, 6, 7, 6, 7]
// 3) Store back the d elements
//    arr[] = [3, 4, 5, 6, 7, 1, 2]
// Time complexity O(n)
// Auxiliary Space: O(d)















// METHOD 2 (Rotate one by one)

// leftRotate(arr[], d, n)
// start
//   For i = 0 to i < d
//     Left rotate all elements of arr[] by one
// end
// To rotate by one, store arr[0] in a temporary variable temp, move arr[1] to arr[0], arr[2] to arr[1] …and finally temp to arr[n-1]

// Let us take the same example arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2
// Rotate arr[] by one 2 times
// We get [2, 3, 4, 5, 6, 7, 1] after first rotation and [ 3, 4, 5, 6, 7, 1, 2] after second rotation.







































