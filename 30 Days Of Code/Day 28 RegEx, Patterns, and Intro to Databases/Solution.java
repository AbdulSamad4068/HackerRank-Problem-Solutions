import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> list = new ArrayList<String>();
        for (int a0 = 0; a0 < N; a0++) {
            String firstName = in.next();
            String emailID = in.next();
            String regExPattern = "[a-z].@gmail.com";

            Pattern p = Pattern.compile(regExPattern);
            Matcher m = p.matcher(emailID);
            if (m.find()) {
                list.add(firstName);
            }

        }
        Collections.sort(list);
        for (String string : list) {
            System.out.println(string);
        }
        in.close();
    }
}
