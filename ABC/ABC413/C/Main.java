package ABC.ABC413.C;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<int[]> queue = new LinkedList<>(); // [値, 個数]のペアを格納

        for(int i=0;i<N;i++){
            int query = sc.nextInt();
            if(query == 1){
                int c = sc.nextInt();
                int x = sc.nextInt();
                queue.add(new int[]{x, c}); // 値と個数をペアで追加
            } else {
                int k = sc.nextInt();
                long sum = 0; // オーバーフロー対策でlong使用
                
                while(k > 0){
                    int[] front = queue.peek();
                    int value = front[0];
                    int count = front[1];
                    
                    if(k >= count){
                        // 先頭の要素を全て使用
                        sum += (long)value * count;
                        k -= count;
                        queue.remove();
                    } else {
                        // 先頭の要素を一部使用
                        sum += (long)value * k;
                        front[1] = count - k; // 残りの個数を更新
                        k = 0;
                    }
                }
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
