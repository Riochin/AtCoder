package ABC085C;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int Y = sc.nextInt();

        int x = -1;
        int y = -1;
        int z = -1;

        sc.close();

        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                int k = n-i-j;

                int totalMoney = j*5000+i*10000+k*1000;
                if(totalMoney==Y){
                    x = i;
                    y = j;
                    z = k;
                    break;
                }
            }
            if(x != -1) break;
        }

        System.out.println(x + " " + y + " " + z);
    }
}
