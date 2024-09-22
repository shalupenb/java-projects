package hackerrank;

import java.util.*;

public class Hackerrank {

	public static void main(String[] args) {
		
		//=============================Task 1
		
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        //=============================Task 2
        
        int N = scan.nextInt();
        String  w = "Weird";
        String nw = "Not Weird";
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2 == 0) {
            if(N <= 5) {
                System.out.println(nw);
            } else if(N <= 20) {
                System.out.println(w);
            } else {
                System.out.println(nw);
            }
        } else {
            System.out.println(w);
        }

        //=============================Task 3
        
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
        
	}

}
