// Finds the power of A power B and then finds the kth digit of the number
class KthDigitWithPower {
    public static void main(String[] args) {
       int A = 3, B=3, k=1;
      // Built-in pow function to find A power B
       long power=(long)Math.pow(A,B);
        long i=1;
        
        while(power>0){
            long ans=power%10;
          // 
            if(k==i){
                return ans;
            }
            i++;
            power=power/10;
        }
        return 0;
       
    }
}
