class Solution {
    public String decodeString(String s) {
        Stack<String> stringStack=new Stack<>();
        Stack<Integer> countStack=new Stack<>();
        int n=s.length();

        int num=0;
        String curr="";

        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                countStack.push(num);
                stringStack.push(curr);
                num = 0;
                curr = "";
            }

            else if (Character.isLetter(ch)) {
                curr = curr + ch;
            }
            
            else { 
                int k = countStack.pop();
                String prev = stringStack.pop();

                String temp = "";
                for (int j = 0; j < k; j++) {
                    temp = temp + curr;
                }

                curr = prev + temp;
            }

        }
        return curr;


    }
}