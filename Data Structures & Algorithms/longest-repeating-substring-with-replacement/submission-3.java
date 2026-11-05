class Solution {
    public int characterReplacement(String s, int k) {

        int freq[] = new int[26];
        int left = 0 , right = 0;
        int maxi = 0;
        int len = 0;
        int maxLen = 0 ;

        while(right < s.length()){

            freq[s.charAt(right)-'A']++;
            maxi= Math.max(maxi,freq[s.charAt(right)-'A']);
            len = right - left + 1;
            
            if(len - maxi > k){
                freq[s.charAt(left)-'A']--;
                left++;
                len = right - left + 1;
            }
            
            right++;
        }
       return len; 
    }
}
