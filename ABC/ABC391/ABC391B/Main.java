package ABC.ABC391.ABC391B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[][] S = new String[N][N];
        String[][] T = new String[M][M];
        
        for(int i=0;i<N;i++){
            String temp = sc.next();
            S[i] = temp.split("");
        }
        
        for(int i=0;i<M;i++){
            String temp = sc.next();
            T[i] = temp.split("");
        }

        sc.close();

        int a = 0;
        int b = 0;

        // int isMatch = 0;

        for(int i=0;i<=N-M;i++){
            boolean isFound = false;
            for(int j=0;j<=N-M;j++){
                for(int k=0;k<M;k++){
                    boolean isMatch = true;
                    for(int l=0;l<M;l++){
                        a = i+k;
                        b = j+l;
                        
                        if(!S[i+k][j+l].equals(T[k][l])){
                            // System.out.println("a: " + a + ", b: " + b +"と" + "k: " + k + ", l: " + l + "は一致しません");   
                            isMatch = false;
                            break;
                        }
                        // System.out.println("a: " + a + ", b: " + b +"と" + "k: " + k + ", l: " + l);
                        if(k==M-1 && l==M-1){
                            isFound = true;
                            a = i+1;
                            b = j+1;
                            break;
                        }
                    }
                    if(!isMatch){
                        break;
                    }
                    if(isFound){
                        break;
                    }
                }
                if(isFound){
                    break;
                }
            }
            if(isFound){
                break;
            }
        }

        System.out.println(a + " " +b);
    }
}
