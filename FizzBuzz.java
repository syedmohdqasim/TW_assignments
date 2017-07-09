import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by root on 9/7/17.
 */
public class FizzBuzz {
    private static int getN() {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= 0;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return n;
    }

    public static void main(String args[])
    {
        FizzBuzz();

    }

    private static void FizzBuzz() {
        for(int i=1;i<=100;i++)
        {
            if(i%3==0) {
                System.out.print("Fizz");

                if (i % 5 == 0)
                    System.out.print("Buzz");

            }
            else if(i%5==0)
                System.out.print("Buzz");
            else
                System.out.print(i);

                System.out.println();


        }
    }

}
