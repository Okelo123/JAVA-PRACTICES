/*
Write a JAVA program that accept the dimensions of a rectangle 
and a rhombus. The program should then use an overloaded function 
named area to determine area of the respective figures. 
Output the dimensions and areas of the figures. 
Rectangle = l*w Rhombus = b × h.
 */
import java.util.Scanner;
public class BSE1 
{ 
    void area(float l, float w)
    {
     System.out.println("Area of Rectangle="+l*w);   
    }
    void area(double b, double h)
    {
     System.out.println("Area of Rhombus="+b*h);   
    }
    public static void main(String[] args) 
    {
   Scanner tue = new Scanner (System.in);
   float l,w;
   double b,h;
   System.out.println("Enter Length of the Rectangle=");
   l=tue.nextFloat();
   System.out.println("Enter width of the Rectangle=");
   w=tue.nextFloat();
   System.out.println("Enter base of the Rhombus=");
   b=tue.nextDouble();
   System.out.println("Enter height of the Rhombus=");
   h=tue.nextDouble();
   BSE1 student = new BSE1();
   student.area(l, w);
   student.area(b, h);
    }
    
}