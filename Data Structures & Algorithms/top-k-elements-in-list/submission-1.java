class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] res=new int[k];

        Map<Integer,Integer> map=new HashMap<>();
         

          for(int i:nums){

            map.put(i,map.getOrDefault(i,0)+1);
          }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

   Collections.sort(
            entryList,
            new Comparator<Map.Entry<Integer, Integer> >() {
                public int compare(
                    Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2)
                {
                    if (o1.getValue() == o2.getValue())
                        return o2.getKey() - o1.getKey();
                    else
                        return o2.getValue()- o1.getValue();
                            
                } });

                 for(int i=0;i<k;i++){
                         
                         res[i]=entryList.get(i).getKey();
                 }
                 return res;

 } 

           
}
