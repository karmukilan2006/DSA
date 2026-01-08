class Solution {
    public String minRemoveToMakeValid(String s) {
        int n=s.length();
        Stack<Integer> openstack=new Stack<>();
        Stack<Integer> closestack=new Stack<>();

        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                openstack.push(i);
            }
            else if(ch==')')
            {
                if(!openstack.isEmpty())
                {
                    openstack.pop();
                }
                else
                {
                    closestack.push(i);
                }
            }
            else
            {
                continue;
            }
        } 
        if(closestack.isEmpty() && openstack.isEmpty())
        {
            return s;
        }
        
        char[] arr = s.toCharArray();

       
        while (!closestack.isEmpty()) {
            arr[closestack.pop()] = '#';
        }

        
        while (!openstack.isEmpty()) {
            arr[openstack.pop()] = '#';
        }

        String result = "";
        for (int i = 0; i < n; i++) {
            if (arr[i] != '#') {
                result += arr[i];
            }
        }
        return result;
        
    }
}