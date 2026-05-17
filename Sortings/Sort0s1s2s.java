package Sortings;

public class Sort0s1s2s {

    public static void sort012(int a[], int n) {
        int low=0,mid=0,high=n-1;
        while(mid<=high)
        {
            if(a[mid]==0)
            {
                swap(a,low,mid);
                low++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else
            {
                swap(a,mid,high);
                high--;
            }
        }
    }


    private static void swap(int[] a, int low, int mid) {
        int temp=a[low];
        a[low]=a[mid];
        a[mid]=temp;
    }


    public static void main(String[] args) {
        int a[] = new int[] { 0, 1, 2, 0, 1, 2 };
        sort012(a, a.length);
        for (int i : a)
            System.out.print(i + " ");
    }
}