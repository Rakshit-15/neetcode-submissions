class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
    new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));
        int[] ans = new int[k];

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    pq.offer(entry);

    if (pq.size() > k) {
        pq.poll();
    }
}
          
       for(int i=0;i<k;i++){
        ans[i]=pq.poll().getKey();
       }
       return ans;
    }

    // class Pair{
    //     int val;
    //     int freq;
        
    //     Pair(int val, int freq){
    //         this.val=val;
    //         this.frerq=freq;
    //     }
    }

