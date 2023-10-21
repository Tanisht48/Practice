import java.util.Scanner;

public class SelectionSort {

        public static void printArr(int[] arr)
        {
            for(int i :arr)
            {
                System.out.print(i+" ");
            }
        }

    public static void selectionSort(int[] arr)
    {
        int n = arr.length;


        for(int i = 0;i < n-1;i++)
        {
            int minindex = i;
            for(int j = i+1;j < n;j++)
            {
                if(arr[minindex] >arr[j])
                {
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
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
            selectionSort(arr);
            printArr(arr);
        }
    }


