
package segundotrimestre1;

import java.util.Scanner;

public class segundotrimestre1 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ex1, ex2, med;
        ex1=sc.nextInt();
        med=sc.nextInt();
       //med=(ex1*0.4) + (ex2*0.6);
       ex2= (med-(ex1*0.4))/0.6;
        System.out.println("Tiene que sacar un "+ex2+".");
    }
    
}
