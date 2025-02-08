package ABC.ABC389.C;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();

        Queue<Integer> snakes = new ArrayDeque<>();
        List<Long> headPositions = new ArrayList<>();
        long lastHead = 0;  // 最後尾のヘビの頭の位置
        long offset = 0;  // 先頭削除時の補正値
        int removedCount = 0;  // 何匹削除されたか

        for (int i = 0; i < Q; i++) {
            int type = sc.nextInt();

            if (type == 1) {  // 1 l: 末尾に追加
                int l = sc.nextInt();
                if (snakes.isEmpty()) {
                    headPositions.add(0L);  // 最初のヘビの頭は 0
                } else {
                    headPositions.add(lastHead);  // 最後尾のヘビの頭
                }
                lastHead += l;
                snakes.add(l);

            } else if (type == 2) {  // 2: 先頭削除
                int removedLength = snakes.poll();
                offset += removedLength;
                removedCount++;

            } else if (type == 3) {  // 3 k: k番目のヘビの頭の座標
                int k = sc.nextInt();
                System.out.println(headPositions.get(removedCount + k - 1) - offset);
            }
        }
        sc.close();
    }
}