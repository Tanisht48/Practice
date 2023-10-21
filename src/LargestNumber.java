public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {70, 197, 277, 37, 477, 57, 46778, 774, 4587, 97, 2107, 111};
       int max = Integer.MIN_VALUE;
        for(int i:arr)
           if(max<i)max = i;

        System.out.println(max);
    }

}
