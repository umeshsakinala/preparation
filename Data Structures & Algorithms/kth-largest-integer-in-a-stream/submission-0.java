class KthLargest {
    int k;
    List<Integer> li = new ArrayList<Integer>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i=0; i<nums.length; i++) {
            li.add(nums[i]);
        }
    }
    
    public int add(int val) {
        li.add(val);
        Collections.sort(li);
        return li.get(li.size()-k);
    }
}
