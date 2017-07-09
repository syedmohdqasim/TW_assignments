import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by root on 9/7/17.
 */
public class RightTriangle {
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
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
