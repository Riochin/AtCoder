package ABC.ABC390A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isSorted = true;

        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i=0;i<5;i++){
            array[i] = sc.nextInt();
        }
        sc.close();

        for(int i=0;i<4;i++){
            if(array[i]>array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                break;
            }
            if(i==3){
                isSorted = false;
            }
        }

        for(int i=0;i<5;i++){
            if(array[i] != i+1){
                isSorted = false;
            }
        }

        if(isSorted){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}