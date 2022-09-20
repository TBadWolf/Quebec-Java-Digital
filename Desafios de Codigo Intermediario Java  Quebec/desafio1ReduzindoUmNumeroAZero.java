import java.util.*;
 
public class Program
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

        while (num > 0)
        {
            if ((num & 1) == 1)
            {
                step++;
            }
            num /= 2;
            step++;
        }

	if(step > 0){
	    System.out.println(step -1);
	}else{
	    System.out.println(step);
	}
    }
}