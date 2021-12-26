public class SwapNumber {

    public static void main(String[] args)
    {
        int x, y, temp;

        x = 100;
        y = 200;

        System.out.println("Before swap the numbers are");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After swap the number are");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
