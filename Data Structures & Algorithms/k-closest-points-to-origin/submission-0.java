class Solution {
    public int[][] kClosest(int[][] points, int k) {

        //finding closest mean finding min value so we will use the max heap and poll the element once
        // the k exceeds we will remove and then we will be left with minimum ones as we are polling 
        // maximums and k numbers will be left in the heap.


        PriorityQueue<Triple> pq = new PriorityQueue<>((a,b)->Double.compare(b.val, a.val));
        int val=0;

        for(int i=0;i<points.length;i++){
                int x = points[i][0];
                int y = points[i][1];
            
            double dist = Math.sqrt((x)*(x) + (y)*(y));

            pq.add(new Triple(dist,x,y));
            if(pq.size()>k){
                pq.poll();
            }                           
        }
        int[][] ans = new int[k][2];
        
        for (int i = 0; i < k; i++) {
    Triple current = pq.poll();

    ans[i][0] = current.x;
    ans[i][1] = current.y;
}
        return ans;

        }        
    }

    class Triple{
        double val;
        int x;
        int y;

        Triple(double val,int x,int y){
            this.val=val;
            this.x=x;
            this.y=y;
        }
    }

