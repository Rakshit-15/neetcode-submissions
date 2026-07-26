class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

           String t = new String(arr);
             
             if(!map.containsKey(t)){
                map.put(t,new ArrayList<>());
             }
              map.get(t).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

