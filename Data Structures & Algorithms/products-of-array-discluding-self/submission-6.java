class Solution {
    public int[] productExceptSelf(int[] nums) {

    int[] arr= new int[nums.length];
    int i=0;
    int sum=1;
    for(i=0;i<nums.length;i++)
    {
        arr[i]=sum;
        sum*=nums[i];
    }

    sum=1;
    for(i=nums.length-1;i>=0;i--)
    {
        arr[i]*=sum;
        sum*=nums[i];
    }

    return arr;
}  }
