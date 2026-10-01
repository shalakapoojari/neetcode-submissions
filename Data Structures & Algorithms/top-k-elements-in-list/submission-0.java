class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map=new HashMap<>();

        //made a map w number and frequency 
        for(int num:nums)
        {
            //getordefault returns the frequency of num, 
            //if num doesnt exist, returns 0
            map.put(num, map.getOrDefault(num,0)+1);
        }
        //matching the frequencies to k
        List<int[]> kvals = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            kvals.add(new int[]{entry.getValue(), entry.getKey()});
        }

        kvals.sort((a, b) -> b[0] - a[0]);

        int[] op=new int[k];
        for(int i=0;i<k;i++)
        {
            //gets the key val
            op[i]=kvals.get(i)[1];
        }
        
        return op;

        
    }
}
