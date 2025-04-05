package ABC.ABC400.A;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(400 % N == 0){
            System.out.println(400 / N);
        }else {
            System.out.println(-1);
        }

        sc.close();
    }
}
