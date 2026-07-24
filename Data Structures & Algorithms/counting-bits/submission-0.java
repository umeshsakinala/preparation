class Solution {
    public int[] countBits(int n) {
        int nums[] = new int[n+1];
        nums[0] = 0;
        for(int i=1; i<=n; i++) {
            int number = i;
            int count = 0;
            while(number > 0) {
                if((number&1) == 1) {
                    count++;
                }
                number = number >> 1;
            }
            nums[i] = count;
        }
        return nums;
    }
}
