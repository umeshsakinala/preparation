class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int answer[] = new int[k];
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 1)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> mp.get(a) - mp.get(b));
        for(Map.Entry<Integer, Integer> i: mp.entrySet()) {
            pq.add(i.getKey());
            if(pq.size() > k) {
                pq.poll();
            }
        }
        for(int i=0; i<k; i++) {
            answer[i] = pq.poll();
        }
        return answer;
    }
}
