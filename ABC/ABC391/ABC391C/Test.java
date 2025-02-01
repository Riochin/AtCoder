package ABC.ABC391.ABC391C;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int nests[] = new int[N];
        Bird birds[] = new Bird[N];
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
                    System.out.print("クエリ1: 移動を実行します。 ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.print( a + "->" + b);
                    System.out.println();
                    
                    moveBird(birds, nests, a-1, b-1);
                    
                    System.out.println();
                    break;
                case 2:
                    System.out.println("クエリ2: 出力を実行します。");
                    int count = 0;
                    for(int j = 0; j < N; j++){
                        
                        System.out.println(j+1 + "には"+nests[j] + "羽の鳩がいます");
                        if(nests[j] >= 2){
                            count++;
                        }
                    }
                    System.out.println(count);
                    System.out.println();
                    break;
            }
        }
        sc.close();
    }

    static void moveBird(Bird birds[], int nests[], int who, int to){
        nests[to] += 1;
        int from = birds[who].getWhere();
        nests[from] -= 1;
        birds[who].move(to);

        System.out.println("鳩" + (who+1) + "が" + (to+1) + "に移動しました");
        outputBirds(birds, nests);
        outputNests(nests);
        System.out.println();
        
    }

    static void outputBirds(Bird birds[], int nests[]){
        for(int i = 0; i < birds.length; i++){
            System.out.println("鳩" + (i+1) + "は" + (birds[i].getWhere()+1) + "にいます");
        }
    }

    static void outputNests(int nests[]){
        for(int i = 0; i < nests.length; i++){
            System.out.print((i+1) + ":" +nests[i] + " ");
        }
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
