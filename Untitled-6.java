import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();
        long cnt1 = 0, cnt2 = 0;
        while (n % 2 == 0) {
            n /= 2;
            cnt1++;
        }
        while (n % 3 == 0) {
            n /= 3;
            cnt2++;
        }
        if (cnt1 <= cnt2 && n == 1) {
            System.out.println(2 * cnt2 - cnt1);
        } else {
            System.out.println("-1");
        }
    }
}
