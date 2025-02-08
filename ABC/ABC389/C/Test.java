package ABC.ABC389.C;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        // HashMap<Integer, Integer> snakes = new HashMap<>();
        // List<Integer> length = new ArrayList();
        Queue<Integer> snakes = new ArrayDeque<Integer>();

        for(int i=0;i<Q;i++){
            int Query = sc.nextInt();
            System.out.println("クエリ" + Query + "を実行します");
            for(int j=0;j<snakes.size();j++){
                System.out.print("へび"+ j+ ":"+snakes.toArray()[j] + ",");
            }
            System.out.println();

            switch(Query){
                case 1: //1 l ヘビの追加
                    int l = sc.nextInt();
                    System.out.println("ながさ" + l + "の蛇を追加しました");
                    snakes.add(l);
                    
                    break;
                case 2: //2 ヘビが抜ける
                    System.out.println("先頭のヘビが抜けました:" + snakes.toArray()[1] + "の長さ");
                    snakes.poll();
                    
                    break;
                case 3: //3 k k番目の蛇の頭の座標を出力
                
                    int k = sc.nextInt();
                    System.out.println(k + "番目の蛇の頭の位置は" + snakes.toArray()[k-1]);

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
