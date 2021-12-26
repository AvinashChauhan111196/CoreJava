public class Harmonic
{
    public static void main(String[] args)
    {
        double sum = 0.0;
        int n=5;

        for (int i = 1; i <= n; i++)
        {
            sum += 1.0 / i;
            System.out.println(sum);
        }

        System.out.println("The sum of series is " +sum);
    }
}
