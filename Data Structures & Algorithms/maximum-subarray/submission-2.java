class Solution {

    //two ways of writting kadanes
    // public int maxSubArray(int[] nums) {
      
    //        int currSum = nums[0];
    //     int maxSum=nums[0];

    //     for(int i=1;i<nums.length ; i++) {
    //         currSum = Math.max(nums[i], currSum + nums[i]);

    //         maxSum = Math.max(maxSum, currSum);
    //     }
    //     return maxSum;
    // }

     public int maxSubArray(int[] nums) {
      
            int sum = 0;
        int maxi=Integer.MIN_VALUE;

        for(int number : nums) {
            sum=sum+number;

            maxi=Math.max(maxi,sum);
            if(sum < 0){
                sum=0;
            }

            
        }
        return maxi;
    }
    }

