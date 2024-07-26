// Print numbers from 1 to n without the help of loops. You only need to complete the function 
// printNos() that takes N as parameter and prints number from 1 to N recursively.

class Solution
{
    
  public void printNos(int N)
    {
        //Your code here
        // int num;
        if(N==0){
            return;
        }
        else{
            printNos(N-1);
            System.out.print(N+" ");
        }
    }
}