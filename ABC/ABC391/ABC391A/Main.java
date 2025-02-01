package ABC.ABC391.ABC391A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        sc.close();

        
        switch(input){
            case "N":
                input = "S";
                break;
            case "S":
                input = "N";
                break;
            case "W":
                input = "E";
                break;
            case "E":
                input = "W";
                break;
            case "NE":
                input = "SW";
                break;
            case "NW":
                input = "SE";
                break;
            case "SE":
                input = "NW";
                break;
            case "SW":
                input = "NE";
                break;
        }
    
        System.out.println(input);        
    }
    
}
