public class LargestNumber
{
    public static void main(String[] args)
    {
        int a = 4, b = 4, c = 2;

        if(a>=b && a>=c)
        {
            System.out.println(a + " is the largest number.");
        }
        else if (b>=a && b>=c)
        {
            System.out.println(b + " is the largest number.");
        }
        else
        {
            System.out.println(c + " is the largest number.");
        }
    }
}
