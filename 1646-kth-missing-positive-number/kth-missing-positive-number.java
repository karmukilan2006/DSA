class Solution {
    public int findKthPositive(int[] arr, int k) {
     int n=arr.length;
     int left=0;
     int right=n-1;
     while(left<=right)
     {
        int mid=(left+right)/2;
        int mis=arr[mid]-(mid+1);
        if(mis<k)
        {
            left=mid+1;
        }
        else
        {
            right=mid-1;
        }
     }
     return left+k;
    }
}