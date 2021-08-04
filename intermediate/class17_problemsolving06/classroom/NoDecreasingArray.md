Non decreasing subarray queries
Problem Description

Given an array A of size N. You will be given M queries to process. Each query will be of the form B[i][0] B[i][1].

If the subarray from B[i][0] to B[i][1] is non decreasing, the output should be 1 else output should be 0.

Return an array of integers answering each query.


Problem Constraints
1 <= N <= 105

1 <= A[i] <= 109

1 <= M <= 105

1 <= B[i][0], B[i][1] <= N


Input Format
First argument contains the array A.

Second argument contains B, denoting the queries.


Output Format
Return an array of integers consisting of 0 and 1


Example Input
Input :
A = [1, 7, 3, 4, 9]
B = [ 
      [1, 2], 
      [2, 4]
    ]


Example Output
Input :
[1, 0]


Example Explanation
Explanation :
Query 1: The subarray in the range [1, 2] is {1, 7} which is non-decreasing. Therefore, ans = 1
Query 2: The subarray in the range [2, 4] is {7, 3, 4, 9} which is not non-decreasing. Therefore, ans = 0