class Solution {
    public String minWindow(String s, String t) {
        
        int start=0 , end =0,minStart=0;
        int minLen=Integer.MAX_VALUE;
        int count=0;
        int n = t.length();

  
        int[] freq = new int[256];

       if (s == null || t == null ||
                s.length() < t.length() ||
                t.isEmpty()) {
            return "";
        }

        for(int i = 0 ; i < t.length() ; i++){
             freq[t.charAt(i)]++;
        }

        for(end=0 ; end < s.length();end++){
              if(freq[s.charAt(end)] > 0){
                count++;   
              }
              freq[s.charAt(end)]--;
              

              while(count == n){       
                int currLen = end-start+1;
                if(currLen < minLen){
                    minLen = currLen;
                    minStart=start;
                }       
                freq[s.charAt(start)]++;
                if(freq[s.charAt(start)] > 0) count--;    
                start++; 
              }
        }
         
         return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(minStart, minStart + minLen);



    }
}
