import java.util.Scanner;
public class ToUpperCaseMethod{

    public static void main(String[] args) {

        int num = 32;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a String which convert in uppercase: ");
        String str = obj.nextLine();

        char ch[] = str.toCharArray(); //convert string into character array
        int arr[] = new int[ch.length];//create empty int array



        for(int i=0 ; i<ch.length ; i++)
        {
            if(ch[i]>=97 && ch[i]<=122 )
            {
                arr[i] = ch[i] - num;
                ch[i] = (char)arr[i];

            }

        }

        for(int i=0 ; i<ch.length ; i++)
        {
            System.out.print(ch[i]);
        }



    }
}
