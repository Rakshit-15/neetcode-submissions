class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set=new HashSet<Character>();

        int start=0;
        int end=0;
        int max=0;

        while(end<s.length()){

           char currChar=s.charAt(end);

           if(!set.contains(currChar)){
                set.add(currChar);
                end++;

                max=Math.max(max,end-start);

           }
           else{

            set.remove(s.charAt(start));
            start++;
           }

        }
        return max;
        
    }
}
