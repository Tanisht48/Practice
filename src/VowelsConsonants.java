import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<Character> vowels  =new ArrayList<>();
        List<Character> consonants = new ArrayList<>();

        for(char i : str.toCharArray() )
        {
            if(isVowel(i))vowels.add(i);
            else if(Character.isLetter(i) && !isVowel(i))consonants.add(i);
        }

        System.out.println(vowels);
        System.out.println(consonants);
    }

    private static boolean isVowel(char i) {
        i = Character.toLowerCase(i);
        if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')return true;

        return false;
    }
}
