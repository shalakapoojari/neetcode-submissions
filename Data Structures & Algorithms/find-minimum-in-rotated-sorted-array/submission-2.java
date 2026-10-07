class Solution {
    public int findMin(int[] nums) {
        // int min=nums[0];

        // for(int i:nums)
        // {
        //     min=Math.min(min,i);
        // }

        // return min;   
        int l=0, r=nums.length-1, res=nums[0];

        while(l<=r)
        {
            if(nums[l]<nums[r])
            {
                res=Math.min(res,nums[l]);
                break;
            }
            int mid=l+(r-l)/2;
            res=Math.min(nums[mid],res);
            
            //as last mai ek large value rahega hi its 1 to n for
            //rotation, checks for sorted part.
            //if l is smaller than right that means it is
            //sorted part of array, move to the second part.
            if(nums[mid]>=nums[l])
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }

        return res;
        
    }
}
