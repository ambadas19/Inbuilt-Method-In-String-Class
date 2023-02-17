import java.util.Scanner;

public class IndexOfmethod {

    public static void main(String[] args) {


        Scanner obj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = obj.nextLine();

        System.out.println("Enter character to find index: ");
        char ch = obj.next().charAt(0);

        char arr[] = str.toCharArray();


        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] == ch)
            {
                System.out.println("Index of chararcter is: "+i);
                break;
            }

        }

        /*int arr2[] = new int [arr.length];




        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] == ch)
            {

                arr2[i] = arr[i];
            }
        }


        //Arrays.sort(arr2) ;
        for(int i=0; i<arr2.length ; i++)
        {
            if(arr2[i] == ch)
            {
                System.out.println("Index of character is " +i);

                break;

            }*/




        }

    }

