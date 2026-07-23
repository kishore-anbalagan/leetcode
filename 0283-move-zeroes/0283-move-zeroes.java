class Solution {
    public void moveZeroes(int[] nums) {
        int t;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                j++;
            }
        }
    }
}