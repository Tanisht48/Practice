import java.util.Scanner;

public class BubbleSort {
    public static void printArr(int arr[])
    {
        for(int i :arr)
        {
            System.out.print(i+" ");
        }
    }

    public static void bubbleSort(int[] arr)
    {
        int n = arr.length;


        for(int j = 0;j < n-1;j++)
        {
            for(int i = 0;i < n-j-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        printArr(arr);
    }
}
