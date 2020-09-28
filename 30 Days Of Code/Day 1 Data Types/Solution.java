import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int integer = scan.nextInt();
        double floating_num = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();

        System.out.println(integer+i);
        System.out.println(floating_num+d);
        System.out.println(s + str);
      

        scan.close();
    }
}