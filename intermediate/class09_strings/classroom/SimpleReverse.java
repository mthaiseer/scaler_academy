
package intermediate.class09_strings.classroom;
class SimpleReverese {
  public String solve(String A) {

    if(A == null || A.length() == 0) return A;

    char[] sarr = A.toCharArray();

    int N = A.length();
    for(int i=0; i<N/2; i++){

      swap(sarr, i, (N-i-1));


    }
    return new String(sarr);
  }


  void swap(char c[], int left, int right){
    char temp = c[left];
    c[left] = c[right];
    c[right] = temp;
  }
}