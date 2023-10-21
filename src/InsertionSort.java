import java.util.Scanner;

public class InsertionSort {
    public static void printArr(int[] arr)
    {
        for(int i :arr)
        {
            System.out.print(i+" ");
        }
    }

    public static void insertionSort(int[] arr)
    {
        int n = arr.length;
        for(int i = 1;i<n;i++)
        {

            for( int j = i-1;j>=0;j--)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else{

                    break;
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
        insertionSort(arr);
        printArr(arr);
    }
}
