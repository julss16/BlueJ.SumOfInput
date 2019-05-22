/**
 * Created by iyasuwatts on 10/17/17.
 * Write a program which prompts the user to input a number, n.
 * The program should respond by printing the sum of the numbers 1 to n.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner game = new Scanner (System.in);
        System.out.println("Hello! Type a number");
        int n = game.nextInt();
        int sum = 0;
        
       for (int i= 1; i <=n; i++) {
        
        
       sum = sum + i; 
       
} 
System.out.println(sum); 
}
}

