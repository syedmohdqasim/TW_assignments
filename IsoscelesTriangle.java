import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by root on 9/7/17.
 */
public class IsoscelesTriangle {
    public static void main(String args[])
    {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= 0;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
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
}
