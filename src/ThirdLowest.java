public class ThirdLowest {
    public static void main(String[] args) {
        int[] arr = {70,77,23,70,23,11,10,197, 277, 37, 477, 57,10,23, 46778, 774, 4587, 97, 2107, 111};
       int ans1 = On(arr);
        System.out.println(ans1);

    }

    private static int On(int[] arr) {
        Integer min1 = null;
        Integer min2 = null;
        Integer min3 = null;

        for (int j : arr) {
            if (min1 == null || min1 > j) {
                min3 = min2;
                min2 = min1;
                min1 = j;
            } else if (min2 == null || (min1 < j && min2 > j)) {
                min3 = min2;
                min2 = j;
            } else if (min3 == null || (min2 < j && min3 > j)) {
                min3 = j;
            }
        }

        return min3!=null?min3:min1;
    }
}
