import java.util.*;

//CCC 2021 S1 - JAVA VERSION
public class CrazyFencing
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        //Using arraylists since its a hassle to set size if using a normal array
        //Two separate lists since dealing with two variables, multiple numbers with space in between per input
        ArrayList<Integer> heights = new ArrayList<Integer>();
        ArrayList<Integer> widths = new ArrayList<Integer>();
        //Sets the number of wood pieces, so we know that there are n+1 heights and n widths
        int n = Integer.parseInt(input.nextLine());
        //Storing these numbers within a string array after spliting up each number after the spaces into an index within normal array
        String [] h = input.nextLine().split(" ");
        String [] w = input.nextLine().split(" ");
        //total is set as a double type since there's decimal answer.
        double total = 0;
        //Adding each height value to a seperate index in the heights arraylist
        for (int i = 0; i < h.length; i++)
        {
            heights.add(Integer.parseInt(h[i]));
        }
        //Adding each width value to a seperate index in the widths arraylist
        for (int i = 0; i < w.length; i++)
        {
            widths.add(Integer.parseInt(w[i]));
        }

        //Formula for calculating total area of crazy fences: w * (h1+h2)/2
        for (int i = 0; i < n; i++)
        {
            total += (widths.get(i) * (heights.get(i) + heights.get(i+1)) / 2.0);
        }
        //Prints out total area
        System.out.println(total);
    }
}