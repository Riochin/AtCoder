package ABC.ABC400.C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();

        long count = 0;

        for (int a = 0; ; a++) {
            long pow2 = 1L << a; // 2^a を計算（ビットシフト）
            if (pow2 > N) break;

            long maxB = (long) Math.sqrt(N / pow2); // b² <= N / 2^a → b <= sqrt(N / 2^a)
            count += maxB;
        }

        System.out.println(count);
    }
}
