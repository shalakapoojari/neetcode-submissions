class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        {
            return false;
        }

        char[] scheck=s.toCharArray();
        char[] tcheck=t.toCharArray();
        Arrays.sort(scheck);
        Arrays.sort(tcheck);
        return Arrays.equals(scheck,tcheck);
    }
}
