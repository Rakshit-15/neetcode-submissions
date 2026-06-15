class Solution {
    public int[] productExceptSelf(int[] nums) {

        
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];

        int[] res=new int[nums.length];

        int leftProd=1;
        int rightProd=1;

        for(int i=0;i<nums.length;i++){
            left[i]=leftProd;
            leftProd=leftProd*nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
            right[i]=rightProd;
            rightProd=rightProd*nums[i];
        }

        for(int i=0;i<nums.length;i++){

            res[i]=left[i]*right[i];
        }

        return res;
    }
}  

// class Solution {
//     public int[] productExceptSelf(int[] nums) {

//         int n = nums.length;
//     int[] left = new int[n];
//     int[] right = new int[n];
//     int[] ans = new int[n];

//     left[0]=1; right[n-1]=1;

//      for(int i =1 ; i < n ; i++){
//         left[i]=left[i-1]*nums[i-1];
//      }
//      for(int i = n-2 ; i >= 0 ; i--){
//         right[i]=right[i+1]*nums[i+1];
//      }

//      for(int i =0;i < n ;i++){
//         ans[i]=left[i]*right[i];
//      }
//          return ans;
//     }
   
// }


