class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int sum=nums[0];//max sum
        int max=nums[0];//max sum

        int minsum=nums[0];//min sum
        int min=nums[0];//min sum

        int total=nums[0];//total

        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            max=Math.max(sum,max);//max 

            minsum=Math.min(nums[i],minsum+nums[i]);
            min=Math.min(minsum,min);//min

            total+=nums[i];
        }
        if(max<0) return max;
        return Math.max(max,total-min);  
    }
}