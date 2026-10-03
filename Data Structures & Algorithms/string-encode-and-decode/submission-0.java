class Solution {

    public String encode(List<String> strs) {

        StringBuilder op = new StringBuilder(); 
        for(String s:strs)
        {
            op.append(s.length());
            op.append("#");
            op.append(s);
        }

        return op.toString();

    }

    public List<String> decode(String str) {

        if (str.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> decode = new ArrayList<>();

        int i=0;
        while(i<str.length())
        {
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+length;
            decode.add(str.substring(i,j));
            i=j;

        }

        return decode;

    }
}
