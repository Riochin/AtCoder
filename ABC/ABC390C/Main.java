package ABC.ABC390C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sc2 = new Scanner(System.in);
        // System.out.println("入力を確認します:");
        // String input = sc2.nextLine();
        // System.out.println("入力内容: " + input);
        // sc2.close();

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        // System.out.println("H: " + H + ", W: " + W);
        sc.nextLine();
        String[][] array = new String[H][W];
        for(int i=0;i<H;i++){
            String temp = sc.nextLine();
            array[i] = temp.split("");
            // System.out.println("array[i]: " + array[i][0]);
        }
        sc.close();

        boolean isPossible = true;

        // 0:a, 1:b, 2:c, 3:d
        int a = H;
        int b = 0;
        int c = W;
        int d = 0;

        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(array[i][j].equals("#")){
                    if(a>i){
                        a = i;
                        // System.out.println("a: " + a);
                    }
                    if(b<i){
                        b = i;
                        // System.out.println("b: " + b);  
                    }
                    if(c>j){
                        c = j;
                        // System.out.println("c: " + c);
                    }
                    if(d<j){
                        d = j;
                        // System.out.println("d: " + d);
                    }
                }
            }
        }

        for(int i=a;i<=b;i++){
            for(int j=c;j<=d;j++){
                if(array[i][j].equals(".")){
                    isPossible = false;
                }
            }
        }

        if(H==1 && W==1){
            if(array[0][0].equals(".")){
                isPossible = false;
            }
        }

        if(!isPossible){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
    
}
