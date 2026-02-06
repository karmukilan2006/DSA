class Solution {
    public int findKthPositive(int[] arr, int k) {
     int n=arr.length;
     int count=0;
     ArrayList<Integer> list=new ArrayList<>();
     int last=arr[n-1];
     int q=0;
     for(int i=1;i<=last;i++)
     {
        if(arr[q]!=i)
        {
            list.add(i);
        }
        else
        {
            q++;
        }

     }
     if (list.size() >= k) {
            return list.get(k - 1);
    }

       
    return last + (k - list.size());
    }
}