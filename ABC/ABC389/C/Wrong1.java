package ABC.ABC389.C;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Wrong1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        // HashMap<Integer, Integer> snakes = new HashMap<>();
        // List<Integer> length = new ArrayList();
        Queue<Integer> snakes = new ArrayDeque<Integer>();

        for(int i=0;i<Q;i++){
            int Query = sc.nextInt();
            for(int j=0;j<snakes.size();j++){
            }

            switch(Query){
                case 1: //1 l ヘビの追加
                    int l = sc.nextInt();
                    snakes.add(l);
                    
                    break;
                case 2: //2 ヘビが抜ける
                    snakes.poll();
                    
                    break;
                case 3: //3 k k番目の蛇の頭の座標を出力
                
                    int k = sc.nextInt();

                    int length = 0;
                    for(int j=0;j<k-1;j++){
                        length += (int)snakes.toArray()[j];
                    }

                    System.out.println(length);
                    
                    break;
            }
        }
        sc.close();
    }
}
