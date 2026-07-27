class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int n = s.length();
        int max=0;
        int maxLen=0;
        int end=0;
        int start=0;

             while(end < n){
           if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
            max=Math.max(max,end-start);
           }
           else{
            if(set.contains(s.charAt(end))){
                set.remove(s.charAt(start++));     
            }
           }                
    }
        return max;
    }
}
