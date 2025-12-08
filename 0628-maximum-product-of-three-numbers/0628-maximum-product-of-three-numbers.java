class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a=nums.length;
        int n=nums[a-1]*nums[a-2]*nums[a-3];
        int m=nums[0]*nums[1]*nums[a-1];
        return Math.max(n,m);
    }
}