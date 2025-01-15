/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.Math;

public class Exercise07_11
{
    

    public static double deviation(double[] x)
    {
        double sum = 0;
        double answer = 0;
        
        double mean = mean(x);
        
        for (int i = 0; i < x.length; i++)
        {
            sum += ((x[i] - mean) * (x[i] - mean));
        }
        
        
        answer = Math.sqrt(sum/(x.length-1));
        
        return answer;
        
        
    }
    
    public static double mean(double[] x)
    {
        double sum = 0;
        double mean = 0;
        for (int i = 0; i < x.length; i++)
        {
            sum += x[i];
        }
        mean = sum/x.length;
        return mean;
    }
    
    public static double deviation(int[] x)
    {
        double sum = 0;
        double answer = 0;
        
        double mean = mean(x);
        
        for (int i = 0; i < x.length; i++)
        {
            sum += ((x[i] - mean) * (x[i] - mean));
        }
        
        
        answer = Math.sqrt(sum/(x.length-1));
        
        return answer;
        
        
    }
    
    public static double mean(int[] x)
    {
        double sum = 0;
        double mean = 0;
        for (int i = 0; i < x.length; i++)
        {
            sum += x[i];
        }
        mean = sum/x.length;
        return mean;
    }


    
    
	public static void main(String[] args) {
		
		double[] list = new double[10];
		int[] list = new int[10];
		
		java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter " + list.length + " numbers: ");
        for (int i = 0; i < list.length; i++)
        {
            list[i] = input.nextDouble();
        }
        
        System.out.print("Enter " + list.length + " numbers: ");
        for (int i = 0; i < list.length; i++)
        {
            list[i] = input.nextInt();
        }
        
        System.out.println(deviation(list));
        
        System.out.print(deviation(list));
        
        
		
		
		
	}
}
