package ABC.ABC392.C;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer, Integer> watching = new HashMap<>(N);
        HashMap<Integer, Integer> zekken = new HashMap<>(N);

        for(int i=0;i<N;i++){
            int watch = sc.nextInt();
            watching.put(i+1, watch);
        }

        for(int i=0;i<N;i++){
            int zek = sc.nextInt();
            zekken.put(i+1, zek);
        }

        sc.close();

        for(int i=1;i<=N;i++){
            int whoZekkenI = getKey(zekken, i);
            // System.out.println("ゼッケン"+i+"を着ている人は"+whoZekkenI+"の人です");

            int whoWatched = watching.get(whoZekkenI);
            // System.out.println("ゼッケン"+i+"を着ている人は"+whoZekkenI+"の人で、その人はゼッケン"+watchedZekken+"を見ています");

            int WatchedZekken = zekken.get(whoWatched);
            System.out.print(WatchedZekken);

            if(i != N){
                System.out.print(" ");
            }
        }
    }

    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (K key: map.keySet())
        {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}
