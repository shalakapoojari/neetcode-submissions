
public class Solution {
    public int longestConsecutive(int[] nums) {

    if(nums.length==0) return 0;

    Set<Integer> vals=new HashSet<>();
    for(int n:nums){
        vals.add(n);
    }

    int seq=0;
    for(int n:vals)
    {
        if(!vals.contains(n-1))
        {
            int incr=1;
            while(vals.contains(n+incr))
            {
                incr++;
            }
            seq=Math.max(seq,incr);
        }
    }


    return seq;
    }
}