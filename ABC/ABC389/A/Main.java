package ABC.ABC389.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] nums = (s.split("x"));
        System.out.println((Integer.parseInt(nums[0]) * Integer.parseInt(nums[1])));
        sc.close();
    }
}
