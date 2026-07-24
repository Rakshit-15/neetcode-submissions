class MedianFinder {

    PriorityQueue<Integer> minHeap ;
    PriorityQueue<Integer> maxHeap ;

    public MedianFinder() {
           minHeap = new PriorityQueue<>();
           maxHeap = new PriorityQueue<>((a,b)->Integer.compare(b,a));       
    }
    
    public void addNum(int num) {
       
       if(maxHeap.size()==0){
        maxHeap.add(num);
       }
       else{
        if(num < maxHeap.peek()){
            maxHeap.add(num);
        }
        else{
            minHeap.add(num);
        }
       }
       // maxHeap has 2 more elements than minHeap
       if(maxHeap.size() == minHeap.size()+2){
         minHeap.add(maxHeap.poll());
       } 
       // minHeap has 2 more elements than maxHeap
       else if(minHeap.size() == maxHeap.size()+2){
            maxHeap.add(minHeap.poll());
       }
        
    }
    
    public double findMedian() {

        if(maxHeap.size() > minHeap.size()) return (double)maxHeap.peek();
        if(minHeap.size() > maxHeap.size()) return (double)minHeap.peek();

        double median = (maxHeap.peek()+minHeap.peek())/2.0 ;
         return median;
    }
}
