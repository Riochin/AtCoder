package ABC.ABC400.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        int X = 0;
        final long LIMIT = 1000000000;
        long currentPower = 1;


        for(int i=0;i<=M;i++){
            if (X > LIMIT) {
                System.out.println("inf");
                return;
            }
            X += currentPower;
            if (X > LIMIT) {
                System.out.println("inf");
                return;
            }
            if (i < M) { 
                currentPower *= N;
                if (currentPower > LIMIT) {
                    System.out.println("inf");
                    return;
                }
            }
            // System.out.println(i+ ":" + currentPower);
        }

        System.out.println(X);
    }
}
