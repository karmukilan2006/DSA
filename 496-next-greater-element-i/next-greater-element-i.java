class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[nums1.length];
        Arrays.fill(res,-1);
        for(int i=nums1.length-1;i>=0;i--)
        {
            stack.push(nums1[i]);
        }
        int q=0;

        while(!stack.isEmpty())
        {
            int top=stack.pop();
             int flag=1;
            for(int i=0;i<nums2.length;i++)
            {

                if(top==nums2[i])
                {
                    for(int j=i+1;j<nums2.length;j++)
                    {
                        if(top<nums2[j])
                        {
                            flag=0;
                            res[q]=nums2[j];
                            q++;
                            break;
                        }
                    }
                }
            }
            if(flag==1)
            {
                    q++;

            }
        }
        return res;
    }
}