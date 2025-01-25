package ABC.ABC390B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Double[] array = new Double[N];
        for(int i=0;i<N;i++){
            array[i] = (double)sc.nextInt();
        }
        sc.close();

        Double r = array[1]/array[0];
        boolean isGeometric = true;

        for(int i=0;i<N-1;i++){
            if(array[i]*r!=array[i+1]){
                isGeometric = false;
            }
        }

        if(isGeometric){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
