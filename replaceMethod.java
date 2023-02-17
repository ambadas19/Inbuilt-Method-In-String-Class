import java.util.Scanner;
public class replaceMethod {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String am = obj.nextLine();


        System.out.println("Enter Character Which you want out of the string : ");
        char outString = obj.next().charAt(0);

        System.out.println("Enter Character Which you want in the string : ");
        char inString = obj.next().charAt(0);

        char ch[] = am.toCharArray();

       for(int i=0 ; i<ch.length ; i++)
       {
           if(ch[i] == outString)
           {
               ch[i] = inString;
           }
       }

        for(int i=0 ; i<ch.length ; i++)
        {
            System.out.print(ch[i]);
        }


    }
}
