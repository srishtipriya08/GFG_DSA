// You are given an array arr. You need to print elements of arr in alternate order (starting from index 0).

// arr[] is the array
// n is the number of elements in array.
class Solution {
    public static void print(int arr[]) {
        // your code here
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
            System.out.print(arr[i]+ " ");
        }
    }
}
