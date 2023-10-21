import java.util.HashMap;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int [] arr={2,2,3,6,1,4,2,7,7,4,1};
        HashMap<Integer, Integer> intCount = new HashMap<>();
        for (int c : arr) {
            intCount.put(c, intCount.getOrDefault(c, 0) + 1);
        }
        for(int c : arr) {
            if (intCount.get(c) == 1) {
                System.out.println(c);
                return;
            }
        }
    }
}