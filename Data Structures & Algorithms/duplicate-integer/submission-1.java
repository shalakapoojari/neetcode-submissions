class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hi=new HashSet<>();
        for(int num:nums)
        {
            if (hi.contains(num))
            {
                return true;
            }
            hi.add(num);
        }
        return false;
    }
}