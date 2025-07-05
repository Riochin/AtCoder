package ABC.ABC413.D;

/*
 * 1≤T≤10^5
 * 2≤N≤2×10^5
 * −10 ^9 <= A[i] <= 10^9
 * A[i] != 0 (1<=i<=N)
 * 1 つの入力ファイルにおける N の総和は 2×10^5以下
*/ 

// むりぽ......負の数考慮してなかった！！！！！！！！！！！！

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i=0;i<N;i++){
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            // System.out.println("ソート後: " + Arrays.toString(A));
            // double r = (A[1] * 1.0) / A[0];
            boolean is_broken = false;

            for(int i=1;i<N-1;i++){
                // double tempR = (A[i] * 1.0) / A[i-1];
                // System.out.println("R: " + r + "tempR: " + tempR);
                long x = (long)A[i-1] * A[i+1];
                long y = (long)A[i] * A[i];
                if(x != y){
                    System.out.println("No");
                    is_broken = true;
                    break;
                }
            }
            if(!is_broken)System.out.println("Yes");
        }
        sc.close();
    }
}
