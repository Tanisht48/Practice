public class FiboAll {
    public static void main(String[] args) {
        int n = 20;

        printFiboIterative(n);
        System.out.println();
        System.out.print(0+", "+1+", ");
        printFiboRecursive(n-2,0,1);
        System.out.println();
        int ans1 = nThFiboIterative(n);
        System.out.println(ans1);
        int ans2 = nThFiboRecursive(n-1);
        System.out.println(ans2);
    }

    private static int nThFiboRecursive(int n) {
        if(n==1||n==0)return n;
        return nThFiboRecursive(n-1)+nThFiboRecursive(n-2);
    }

    private static int nThFiboIterative(int n) {
      int a = 0;
      int b = 1;
      for(int i = 2;i<=n;i++)
      {
          int c =a+b;
          a = b;
          b = c;
      }

      return a;
    }

    private static void printFiboRecursive(int n,int a,int b) {
        if(n==0) return;
        int c = a+b;
        a = b;
        b = c;
        System.out.print(c+", ");
        printFiboRecursive(n-1,a,b);
    }

    private static void printFiboIterative(int n) {
        int a = 0;
        int b = 1;
        for(int i = 0;i<n-1;i++)
        {
            System.out.print(a+", ");
            int c =a+b;
            a = b;
            b = c;
        }
        System.out.print(a);

    }
}
