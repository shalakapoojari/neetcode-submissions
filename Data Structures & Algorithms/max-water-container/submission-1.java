class Solution {
    public int maxArea(int[] heights) {

        int l=0;
        int r=heights.length-1;
        int res=0;

        for(int i=0;i<heights.length;i++)
        {
            while(l<r)
            {
                int area=Math.min(heights[l],heights[r])*(r-l);
                res=Math.max(res,area);

                //abandoning the shorter wall
                if(heights[l]<=heights[r]){
                    l++;
                }else{
                    r--;
                }

            }
        }

        return res;
        
    }
}
