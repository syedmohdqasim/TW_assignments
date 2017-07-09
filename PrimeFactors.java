import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Created by root on 9/7/17.
 */
public class PrimeFactors {


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
        int n=getN();
        LinkedList<Integer> l=generate(n);
        System.out.print(l);

    }

    private static LinkedList<Integer> generate(int n) {

        LinkedList<Integer> l=new LinkedList<Integer>();
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                if(isPrime(i))
                {
                    l.add(i);

                }
            }

        }

        return l;
    }

    private static boolean isPrime(int i) {

        for(int j=2;j<i/2;j++)
        {
            if(i%j==0)
                return false;
        }
        return true;
    }
}
