import java.util.HashMap;
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
            String str="Tanisht";
            HashMap<Character, Integer> charCount = new HashMap<>();
            for (char c : str.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
            for(char c : str.toCharArray()) {
                if (charCount.get(c) == 1) {
                    System.out.println(c);
                    return;
                }
            }
        }
    }


