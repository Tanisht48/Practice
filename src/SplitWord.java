import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitWord {
    public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);
    String str = "";
    List<String> ans = splitString(str);
        System.out.println(ans);
    }

    private static List<String> splitString(String str) {
        List<String> ans = new ArrayList<>();


        String s = "";
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                s+=str.charAt(i);
            }
            else{
                ans.add(s);
                while(i<str.length() && str.charAt(i)==' ')i++;
                i--;
                s = "";
            }
        }
        ans.add(s);
        return  ans;
    }
}
