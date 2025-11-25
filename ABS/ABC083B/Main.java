package ABC083B;

import java.util.Scanner;

// time complexity: O(N)

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int res = 0;
        
        for(int i=0;i<=N;i++){
            String s = Integer.toString(i);
            int sum = 0;
            for(int j=0;j<s.length();j++){
                sum += Character.getNumericValue(s.charAt(j));
            }
            if(sum >= A && sum <= B){
                // System.out.println("Added" + sum);
                res += i;
            }
        }

        sc.close();
        System.out.println(res);
    }
}
