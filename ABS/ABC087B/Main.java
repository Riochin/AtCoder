package ABC087B;

import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();

        int count = 0;
        for(int i= 0; i<=A; i++){
            int temp = X - 500*i;
            for(int j=0; j<=B; j++){
                int temp2 = temp - 100 * j;
                if(temp2 >= 0 && temp2/50 <= C){
                    count++;
                    // System.out.println(i+" "+j+" "+temp2/50+"is equal to "+X);
                }
            }
        }
        sc.close();
        System.out.println(count);
    }
    
}
