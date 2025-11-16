class Solution {
    public boolean isValid(String s) 
    {
        Stack <Character> stc =new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {

            stc.push(')');
            }
            else if(c=='[')
            {

            stc.push(']');
            }
            else if(c=='{')
            {

            stc.push('}');
            }
            else if(stc.isEmpty()||stc.pop()!=c)
            {
                return false;
            }
        }
        return stc.isEmpty();
        
    }
}
