package ABC081B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            int tempC=0;

            if(num%2==1){
                count = 0;
                break;
            }
            
            while(num%2==0){
                num/=2;
                tempC ++;
            }

            count = Math.min(count, tempC);
        }

        System.out.println(count);

        sc.close();
    }
}
