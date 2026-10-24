class Solution {
    public int fib(int n) {
         return fib1(n);
    
        } 
    static int  fib1(int n){
        if (n<2){
        return n;
        }
        return fib1(n-1)+fib1(n-2);
    }
   
}