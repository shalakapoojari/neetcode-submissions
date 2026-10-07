class Solution {

    public boolean innerSearch(int[][] matrix, int target, int mid, int cols)
        {
            int l=0, r=cols-1;

            while(l<=r)
            {
                int m=l+(r-l)/2;
                if(matrix[mid][m]<target)
                {
                    l=m+1;
                }
                else if(matrix[mid][m]>target)
                {
                    r=m-1;
                }
                else
                {
                    return true;
                }
            }
            return false;
        }

    public boolean searchMatrix(int[][] matrix, int target) {

        int row=matrix.length, cols=matrix[0].length;
        int start=0, end=row-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(target>=matrix[mid][0] && target<=matrix[mid][cols-1])
            {
                //row found, inner binary search
                return innerSearch(matrix, target, mid, cols);
            }
            else if(target>=matrix[mid][cols-1])
            {
                start=mid+1;
            }
            else if(target<=matrix[mid][cols-1])
            {
                end=mid-1;
            }

        }

        return false;

    }
}
