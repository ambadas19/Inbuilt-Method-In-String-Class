import java.util.*;
public class LengthMethod {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = obj.nextLine();

        char ch[] = str.toCharArray();

        int b=0;

        for (int a : ch)
        {
            b++;
        }
        System.out.println("Length of the String is : "+b);
    }
}
