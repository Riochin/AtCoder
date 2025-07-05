package ABC.ABC413.B;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] words = new String[N];
        for (int i=0;i<N;i++){
            words[i] = sc.next();
        }

        sc.close();

        HashSet<String> set = new HashSet<>();
        for(int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                if(i==j)continue;
                String s = words[i] + words[j];
                set.add(s);
            }
        }

        System.out.println(set.size());
    }
}
