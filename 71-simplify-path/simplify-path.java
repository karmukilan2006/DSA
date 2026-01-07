class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<>();
        for(int i=0;i<parts.length;i++)
        {
            String tokens=parts[i];
            if(tokens.equals("..")) 
            {
                if(!stack.isEmpty()) 
                {
                    stack.pop();
                }
                
            }
            else if(!tokens.equals("") && !tokens.equals(".")) 
            {
                stack.push(tokens);
            }
        }
        String result = "";
        for(int i = 0; i < stack.size(); i++) {
            result += "/" + stack.get(i);
        }
        if(result.equals("")) {
            result = "/";
        }
        return result;
    }
}