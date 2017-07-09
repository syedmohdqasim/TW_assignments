import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by root on 9/7/17.
 */
public class Diamond {

    public static void main(String args[])
    {

        int n = getN();
        upperHalf(n);
        //lower half
        lowerHalf(n);

    }

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

    private static void upperHalf(int n) {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n-i-1;j++)
                System.out.print(" ");

            for(int j=0;j<=(2*i);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void lowerHalf(int n) {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<=i+1;j++)
                System.out.print(" ");

            for(int j=0;j<=(2*(n-i-2));j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
