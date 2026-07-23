
class Solution {

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(
                        (a, b) -> Integer.compare(b, a)
                );

        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {

            int heaviest = pq.poll();
            int secondHeaviest = pq.poll();

            if (heaviest != secondHeaviest) {
                pq.offer(heaviest - secondHeaviest);
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}