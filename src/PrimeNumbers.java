public class PrimeNumbers {
    public static void main(String[] args) {
        int [] arr = {7,17,27,37,47,57,67,77,87,97,107,117,127};

        for(int i:arr)
            if(isPrime(i))System.out.println(i);
    }

    private static boolean isPrime(int n) {
        if(n==1||n==0)return false;

        for(int i = 2;i*i<=n;i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
