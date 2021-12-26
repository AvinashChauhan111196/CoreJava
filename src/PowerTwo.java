public class PowerTwo {

    public static void main(String[] args) {

        int base=2, N=31;
        long result=1;

        for (int i=0; i<=N; i++)
        {
            result *= base;
            System.out.println(base + " to the power "+ i + " is : " + result);
        }
    }
}
