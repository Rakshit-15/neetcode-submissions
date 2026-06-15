class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set=new HashSet<>();
        int longestStreak=0;

        for(int i:nums){
            set.add(i);
        }

          for(Integer num: set){
            if(!set.contains(num-1)){
                int currNum=num;
                int currStreak=1;

                while(set.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }

                longestStreak=Math.max(longestStreak,currStreak);
            }
          }
             return longestStreak;       
        
    }
}
