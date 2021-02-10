import java.util.*;
import java.text.DecimalFormat;

public class VoronoiVillages
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int N = Integer.parseInt(input.nextLine());

        double [] V = new double [N];

        for (int i = 0; i < N; i++)
        {
            V[i] = Double.parseDouble(input.nextLine());
        }

        Arrays.sort(V);

        double smallestSize = Double.MAX_VALUE;

        for (int i = 1; i < N-1; i++)
        {
            double left = (V[i] - V[i-1])/2;
            double right = (V[i+1] - V[i])/2;

            double size = left + right;

            if (size < smallestSize)
            {
                smallestSize = size;
            }
        }

        DecimalFormat df = new DecimalFormat("#.#");

        System.out.printf("%.1f\n",(Math.round(smallestSize*10) / 10.0));
        
    }
}