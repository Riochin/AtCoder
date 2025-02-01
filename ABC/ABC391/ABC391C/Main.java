package ABC.ABC391.ABC391C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int nests[] = new int[N];
        Bird birds[] = new Bird[N];

        int count = 0; //追加

        for(int i=0;i<N;i++){
            nests[i] = 1;
        }
        for(int i = 0; i < N; i++){
            birds[i] = new Bird();
            birds[i].setWhere(i);
        }

        for(int i=0; i<Q; i++){
            int query = sc.nextInt();
            switch(query){
                case 1:
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    
                    count = moveBird(birds, nests, a-1, b-1,count);
                    
                    break;
                case 2:
                    System.out.println(count);
                    break;
            }
        }
        sc.close();
    }

    static int moveBird(Bird birds[], int nests[], int who, int to,int count){
        nests[to] += 1;
        int from = birds[who].getWhere();
        nests[from] -= 1;
        birds[who].move(to);

        // System.out.println("もともといた巣:" +nests[from]);
        // System.out.println("移動先の巣:" +nests[to]);
        
        if(nests[from] == 1){
            count--;
            // System.out.println("もともといた巣にはもう鳩がいません");
        }
        if(nests[to] == 2){
            count++;
            // System.out.println("移動先の巣には鳩が2羽います");
        }

        return count;
    }

}

class Bird {
    private int where;

    public int getWhere(){
        return where;
    }
    public void setWhere(int where){
        this.where = where;
    }

    public void move(int to){
        this.where = to;
    }
}