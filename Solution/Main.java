/**
 * A33
 * @author Mr. King
 * @version 01/07/2022
 */

public class Main
{
    public static void main(String[] args)
    {
        String[] arr1 = {"Hello", "hellogoodbye", "hello goodbye", "hello good bye", "yo "};
        String[] arr2 = {"Everyday I see my dream", "Every time I"};
        int n1 = totalSpaces(arr1);
        int n2 = totalSpaces(arr2);
        System.out.println("Number of spaces for arr1: " + n1);
        System.out.println("Number of spaces for arr2: " + n2);
    }
    
    public static int totalSpaces(String[] arr)
    {
        int c = 0;
        for(String s : arr)
        {
            for(int i = 0; i < s.length(); i++)
            {
                if(s.substring(i, i+1).equals(" "))
                {
                    c++;
                }
            }
        }

        return c;
    }
}
