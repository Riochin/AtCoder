package ABC.ABC389.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = 1;
        sc.close();

        for(int i=1;i<=X;i++){
            Y *= i;
            if(Y == X){
                System.out.println(i);
                break;
            }
        }
    }
}
