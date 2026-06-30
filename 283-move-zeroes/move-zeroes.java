class Solution{
    public void moveZeroes(int[] nums){
        int[] ans = new int[nums.length];
        int index=0;
        //copy all non zero elements
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                ans[index++]=nums[i];

            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}