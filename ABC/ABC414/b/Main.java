package ABC.ABC414.B;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        boolean tooLong = false;
        
        for(int i = 0; i < N && !tooLong; i++){
            String C = sc.next();
            long L = sc.nextLong();  // int -> long
            
            if(sb.length()+L > 100){
                System.out.println("Too Long");
                tooLong = true;
                break;
            }
            
            for(long j = 0; j < L; j++){
                sb.append(C);
            }
        }
        
        sc.close();

        if(!tooLong){
            System.out.println(sb.toString());
        }
    }
}
