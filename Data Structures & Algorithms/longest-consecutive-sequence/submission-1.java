class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int maxlen = 1;
        for(int i=0; i<nums.length; i++) {
            int a = nums[i];
            int len = 1;
            for(int j=i+1; j<nums.length; j++) {
                if(a+1 == nums[j]) {
                    len++;
                    a = nums[j];
                }
            }
            maxlen = Math.max(len, maxlen);
        }
        return maxlen;
    }
}
