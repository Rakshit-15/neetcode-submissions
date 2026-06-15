class Solution {
    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);
        int number = nums[0];

        for(int i =1 ; i< nums.length ; i++){
                 
           if(number == nums[i]) return nums[i];
           number = nums[i];
        }
        return -1;
    }
}
