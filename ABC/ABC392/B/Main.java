package ABC.ABC392.B;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M];

        for(int i=0;i<M;i++){
            A[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(N-M);

        Arrays.sort(A);
        int count = 0;
        int ans[] = new int[N-M];

        for(int j=1;count<N-M;j++){
            for(int i=0;i<M;i++){
                if(A[i] == j){
                    break;
                }
                if(i == M-1){
                    ans[count] = j;
                    count++;
                    break;
                }
            }
        }

        for(int i=0;i<N-M;i++){
            System.out.print(ans[i]);
            if(i != N-M-1){
                System.out.print(" ");
            }
        }

    }
}
