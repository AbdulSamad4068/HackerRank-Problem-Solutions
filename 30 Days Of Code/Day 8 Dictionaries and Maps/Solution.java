//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> info = new HashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            
            info.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(info.containsKey(s)){
                System.out.println(s+"="+info.get(s));
            }
            else{
                System.out.println("Not found");
            }

            // Write code here
        }
        in.close();
    }
}
