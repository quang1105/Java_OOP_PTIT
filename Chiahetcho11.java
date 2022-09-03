import java.math.BigInteger;
import java.util.Scanner;

public class Chiahetcho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            BigInteger n = sc.nextBigInteger();
            BigInteger x = new BigInteger("11");
            BigInteger k = n.divide(x);
            if(k.multiply(x).compareTo(n) == 0)
                System.out.println(1);
            else 
                System.out.println(0);
        }
    }
}
