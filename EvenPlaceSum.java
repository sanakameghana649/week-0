import java.util.Scanner;
class EvenPlaceSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, place = 1;

        while(n > 0)
        {
            int digit = n % 10;

            if(place % 2 == 0)
            {
                sum = sum + digit;
            }

            n = n / 10;
            place++;
        }

        System.out.println("Sum = " + sum);
    }
}