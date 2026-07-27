class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=0,r=0;
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int max=Integer.MIN_VALUE;
        int idx=0;

        while(r < n){
         
           max = Math.max(max,nums[r]);    
          
          if(r-l+1 == k){
            ans[idx++] = max;
            max=Integer.MIN_VALUE;
            l++;
            r=l;
          }
          else{
            r++;
          }
          
        }

        return ans;
    }
}
