import java.util.Scanner;

public class MergeSort {
    public static int[] merge2Sorted(int[] nums1, int[] nums2)
    {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n+m];
        int i = 0,j = 0,k = 0;
        while(i<n && j<m)
        {
            if(nums1[i]<=nums2[j]) ans[k++] = nums1[i++];
            else ans[k++] = nums2[j++];
        }
        while(i<n)ans[k++] = nums1[i++];
        while(j<m)ans[k++] = nums2[j++];

        return ans;

    }
    public static int[] mergeSort(int arr[],int st,int ed)
    {
        if(st==ed)return new int[]{arr[st]};

        int mid = st+(ed-st)/2;

        int[] left = mergeSort(arr,st,mid);

        int[] right = mergeSort(arr,mid+1,ed);

        return merge2Sorted(left,right);
    }
    public static int[] sortArray(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    public static void printArr(int[] arr)
        {
            for(int i :arr) System.out.print(i+" ");
        }
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++)arr[i] = sc.nextInt();

            int []ans = sortArray(arr);
            printArr(ans);
        }
    }


