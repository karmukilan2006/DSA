void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
    int n1=nums1Size;

    int n2=nums2Size;
    int* arr=(int*)malloc((n1)*sizeof(int));
    int k=0;
    int i=0;
    int j=0;
    while(i<m && j<n)
    {
        int a=nums1[i];
        int b=nums2[j];
        if(a>b)
        {
            arr[k]=b;
            j++;
            k++;
        }
        else
        {
            arr[k]=a;
            i++;
            k++;
        }

    }
    while(i<m)
    {
        arr[k]=nums1[i];
        i++;
        k++;
    }
    while(j<n)
    {
        arr[k]=nums2[j];
        j++;
        k++;
    }
    for(int r=0;r<n1;r++)
    {
        nums1[r]=arr[r];
    }
    free(arr);
}