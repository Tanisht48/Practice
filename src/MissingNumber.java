import java.util.Scanner;

public class MissingNumber {
    public static int repeatingElement(int arr[])
    {
        int n = arr.length;
        int element = 0;
        for(int i = 0;i<n;i++)
        {
            int key  = arr[i];
            for(int j = i+1;j<n;j++)
            {
                if(key==arr[j])
                {
                    element = arr[j];
                    break;
                }
            }
        }
        return element;
    }
    public static int missingElement(int arr[])
    {

        int n  = arr.length;


        int sumofall = n*(n+1)/2;
        int sumofarray = 0;
        for(int i = 0;i<n;i++)
        {
            sumofarray+=arr[i];
        }

        int extra = repeatingElement(arr);
        int diff = sumofarray - extra;
        return sumofall-diff;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int duplicate = repeatingElement(arr);
        int missing = missingElement(arr);

        System.out.println(duplicate);
        System.out.println(missing);
    }
}
