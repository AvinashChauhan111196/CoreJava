import java.util.Scanner;

public class FlipCoin {

    public static void  main(String[] args)
    {
        int limit;
        int head = 0;
        int tail = 0;

        System.out.println("Number of times to clip coin ");
        Scanner sc = new Scanner(System.in);
        limit=sc.nextInt();

        if(limit<0)
        {
            System.out.println("Limit Should Be Greater Than 0 ");
        }
        for(int i=1;i<=limit;i++)
        {
            if (Math.random() < 0.5)
            {
                head++;
            }
            else
            {
                tail++;
            }
        }

        double headPercentage = (head/(double)limit)*100;
        double tailPercentage = (tail/(double)limit)*100;

        System.out.println("Number of head is "+head);
        System.out.println("Number of tail is "+tail);
        System.out.println(" Percentage Of head is "+Math.round(headPercentage)+"\n Percentage Of tail is "+Math.round(tailPercentage));

    }
}
