class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int preproduct = 1;
        int postproduct = 1;
        for(int i=0; i<nums.length; i++) {
            result[i] = preproduct;
            preproduct = preproduct*nums[i];
        }
        for(int i=nums.length-1; i>=0; i--) {
            result[i] = result[i]*postproduct;
            postproduct = postproduct*nums[i];
        }
        return result;
    }
}  
