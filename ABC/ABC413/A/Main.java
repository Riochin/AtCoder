package ABC.ABC413.A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int itemsize = 0;

        int[] items = new int[N];
        for(int item:items){
            itemsize += item;
        }

        if(M >= itemsize){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
