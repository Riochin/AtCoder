package ABC083B;

import java.util.Scanner;

// time complexity: O(N)

public class Main {
    public static int calc(int i){
        int res = 0;
        while (i > 0){
            res += i%10;
            i /= 10;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int res = 0;
        
        for(int i=0;i<=N;i++){
            int wa = calc(i);
            if (wa >= A && wa <= B) res += i;
        }

        sc.close();
        System.out.println(res);
    }
}
