import java.math.BigInteger;
import java.util.Scanner;

public class Boisonhonhat {
    public static Long gcd(Long a, Long b) {
        BigInteger m = BigInteger.valueOf(a);
        BigInteger n = BigInteger.valueOf(b);
        BigInteger gcd = m.gcd(n);
        return gcd.longValue();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            Long n = sc.nextLong();
            Long s = 1L;
            for(Long i = 1L; i <= n; i++) {
                s = s * i / gcd(i, s);
            }
            System.out.println(s);
        }
    }
}