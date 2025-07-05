package ABC.ABC413.A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int itemsize = 0;

        for(int i=0;i<N;i++){
            itemsize += sc.nextInt();
        }
        sc.close();

        if(M >= itemsize){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
