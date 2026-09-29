class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagrams = new HashMap<>();

        for(String s:strs)
        {
            //sorting each string
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sorted=new String(charArray);

            //adding sorted value of string as key and a list
            anagrams.putIfAbsent(sorted, new ArrayList<>());

            //add values to keys, if same key
            anagrams.get(sorted).add(s);
        }

        return new ArrayList<>(anagrams.values());
        
    }
}
