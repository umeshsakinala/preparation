class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int answer = nums[0];
        while(low <= high) {
            if(nums[low] < nums[high]) {
                answer = Math.min(answer, nums[low]);
                break;
            }
            int mid = high - (high - low)/2;
            answer = Math.min(answer, nums[mid]);
            if(nums[mid] >= nums[low]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return answer;
    }
}
