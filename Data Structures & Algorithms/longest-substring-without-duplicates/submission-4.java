class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left  = 0, right  = 0;
        int maxi  = 0 ; 

        while(right < s.length()){
            
            if(!set.contains(s.charAt(right))){
                 set.add(s.charAt(right));
                 maxi=Math.max(maxi,right-left+1);
                 right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
            
        }
        return maxi;
        
    }
}
