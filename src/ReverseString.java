import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String ans = reverseString(str);
        System.out.println(ans);
    }

    private static String reverseString(String str) {

        char []arr = str.toCharArray();
        int i = 0;
        int j = arr.length-1;

        while (i<j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
        StringBuilder ans = new StringBuilder();
        for(char c :arr) ans.append(c);
        return ans.toString();
    }

    private static void swap(char[] arr, int i, int j) {
        if(i==j)return;
        arr[i] = (char)(arr[i]+arr[j]);
        arr[j] = (char)(arr[i]-arr[j]);
        arr[i] = (char)(arr[i]-arr[j]);
    }
}
