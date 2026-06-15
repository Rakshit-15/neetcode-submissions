class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq=new int[26];

        int start=0,maxFreq=0,maxLen=0;

        for(int end=0;end<s.length();end++){
              freq[s.charAt(end)-'A']++;
              

              maxFreq=Math.max(maxFreq,freq[s.charAt(end)-'A']);

              if(end-start+1- maxFreq > k){
                freq[s.charAt(start)-'A']--;
                start++;
              }
               else{
                maxLen=Math.max(maxLen,end-start+1);
               }
        }

        return maxLen;

        
    }
}
