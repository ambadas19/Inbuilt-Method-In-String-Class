import java.util.Scanner;
public class SubStringMethod {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = obj.nextLine();

       // System.out.println(str.substring(0,7));

       char ch[] = str.toCharArray();

        System.out.println("Enter start index: ");
        int start_index = obj.nextInt();

        System.out.println("Enter last index: ");
        int last_index = obj.nextInt();

       for(int i=start_index ; i<last_index ; i++)
       {
           System.out.print(ch[i]);
       }

    }
}
