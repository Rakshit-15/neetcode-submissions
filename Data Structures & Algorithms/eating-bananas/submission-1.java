class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low=1;  int high=findMax(piles);
       int hrsTaken=0;
       int min=Integer.MAX_VALUE;

       while(low <= high){
        int mid =(low+(high-low)/2);
        hrsTaken=calHrs(piles,mid);
        if(hrsTaken <= h) {
            min=Math.min(min,mid);
            high=mid-1;
            
            }
        else low=mid+1;
       }
        return min;
    }

    int calHrs(int[] nums,int bananasPerHour){
            int hrsTaken=0;
            for(int i = 0;i<nums.length;i++){
                if(nums[i] < bananasPerHour) hrsTaken +=1;
                else{
                    hrsTaken +=(int) Math.ceil((double)nums[i]/(double)bananasPerHour);
                }
            }
            return hrsTaken;
    }

    int findMax(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
}
