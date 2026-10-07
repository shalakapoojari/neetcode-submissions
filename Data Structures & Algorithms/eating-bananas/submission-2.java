class Solution {
    public int minEatingSpeed(int[] piles, int h) {

    // int k=1;

    //     while(true)
    //     {
    //         int total=0;
    //         for(int i:piles)
    //         {
    //             total+=(int)Math.ceil((double)i/k);
    //         }

    //         if(total<=h)
    //         {
    //             return k;
    //         }
    //         k++;
    //     }

    int max=0, min=1, res=1;
    for(int i:piles)
    {
        max=Math.max(i,max);
    }
    
    while(min<max)
    {
        int kmid=min+(max-min)/2;
        int total=0;
        for(int i:piles)
        {
            total+=(int)Math.ceil((double)i/kmid);
        }

        if(total<=h)
        {
            //store this val as temporary
            max=kmid;

        }
        else
        {
            min=kmid+1;
        }

    }
    return max;
        
    }
}
