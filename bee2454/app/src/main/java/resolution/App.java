package resolution;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt(), R = scanner.nextInt();
        String response = "";
        if(P == 1){
            if(R == 1){
                response = "A";
            }
            if(R == 0){
                response = "B";
            }
        }else{
            response = "C";
        }
        System.out.println(response);
        scanner.close();
    }
        
}
