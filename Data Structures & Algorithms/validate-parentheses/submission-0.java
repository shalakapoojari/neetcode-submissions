class Solution {
    public boolean isValid(String s) {

        Stack<Character> stk=new Stack<>();

        for(char n:s.toCharArray())
        {
            if(n =='{'||n =='('||n =='[')
            {
                stk.push(n);
            }
            else
            {
                if(stk.isEmpty()) return false;
                char top = stk.pop();
                if(n=='}' && top!='{') return false;
                if (n == ')' && top != '(') return false;
                if (n == ']' && top != '[') return false;
            }
        }

        return stk.isEmpty();
        
    }
}
