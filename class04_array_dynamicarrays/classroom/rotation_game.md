Rotation Game
Problem Description

You are given an integer T (Number of test cases). For each test case, you are given an integer array A and an integer B. You have to print the same array after rotating it B times towards right.

NOTE: You can use extra memory.



Problem Constraints
1 <= T <= 10

1 <= |A| <= 106

1 <= A[i] <= 109

1 <= B <= 109



Input Format
First line of the input contains a single integer T.

Next, each of the test case consists of 2 lines:

First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
Second line contains a single integer B


Output Format
For each test case, print an array of integers which is the Bth right rotation of input array A, on a separate line.



Example Input
Input 1:

 2
 4 1 2 3 4
 2
 3 1 2 4
 1
Input 2:

 1
 3 1 2 2
 3


Example Output
Output 1:

 3 4 1 2
 4 1 2
Output 2:

 1 2 2


Example Explanation
Explanation 1:

 For Test Case 1:
 [1,2,3,4] => [4,1,2,3] => [3,4,1,2]
 For Test Case 2:
 [1,2,4] => [4,1,2]
Explanation 2:

 For Test Case 1:
 [1,2,2] => [2,1,2] => [2,2,1] => [1,2,2]