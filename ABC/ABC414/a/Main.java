package ABC.ABC414.A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();

        int count = 0;

        for(int i=0;i<N;i++){
            int nL = sc.nextInt();
            int nR = sc.nextInt();
            if(nL <= L && nR >= R){
                count ++;
            }
        }

        sc.close();

        System.out.println(count);
    }

}
