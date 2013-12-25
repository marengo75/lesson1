package ua.lesson1.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Ponomarenko
 * Date: 23.12.13
 * Time: 16:11
 */
public class Calculation
{

    public static void main(String[] args) throws ArithmeticException, NumberFormatException, IOException
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());

            System.out.println("The result of calculation ((a-b)*2+c)/(a-b) is equal to " + calc(a, b, c));
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error: number format exception");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: division by zero");
        }

    }

    public static float calc(int a, int b, int c)
    {
            a = a - b;
            return (a*2 + c)/a;
    }
}
