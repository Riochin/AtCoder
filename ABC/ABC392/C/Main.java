package ABC.ABC392.C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] watching = new int[N + 1];
        int[] zekken = new int[N + 1];
        int[] reverseZekken = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            watching[i] = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            zekken[i] = sc.nextInt();
            reverseZekken[zekken[i]] = i;
        }

        sc.close();

        for (int i = 1; i <= N; i++) {
            int whoZekkenI = reverseZekken[i];
            int whoWatched = watching[whoZekkenI];
            int watchedZekken = zekken[whoWatched];
            System.out.print(watchedZekken);

            if (i != N) {
                System.out.print(" ");
            }
        }
    }
}