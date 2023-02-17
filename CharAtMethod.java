import java.util.*;
public class CharAtMethod {

    public static void main(String[] args) {


        Scanner obj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = obj.nextLine();

        char ch[] = str.toCharArray();

        System.out.println("Enter index: ");
        int index_num = obj.nextInt();

        if(index_num>=ch.length)
        {
            System.out.println("Array index out of bound exception");
        }

        for(int i=0 ; i<ch.length ; i++)
        {
            if(i==index_num)
            {
                System.out.println("Index number of chararcter is: "+ch[i]);

            }

        }



    }
}
