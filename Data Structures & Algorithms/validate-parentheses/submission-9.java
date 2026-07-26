class Solution {
     public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        if(s.length()==1) return false;

        for(char ch : s.toCharArray()){
         //opening bracket
            if(ch == '{' || ch == '(' || ch == '['){
                 st.push(ch);
            }
             // Closing brackets
            else {

                // No opening bracket available
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                if(ch == ')'  && top!= '(') return false;
                if(ch == '}'  && top!= '{') return false;
                if(ch == ']'  && top!= '[') return false;
            
        }     
    }
       return st.isEmpty();
}
}
