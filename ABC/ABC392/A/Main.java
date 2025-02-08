package ABC.ABC392.A;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        for(int i=0;i<3;i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        if(a[0] * a[1] == a[2]){
            System.out.println("Yes");
        } else if(a[0] == a[2] * a[1]){
            System.out.println("Yes");
        } else if(a[1] == a[0] * a[2]){ 
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
