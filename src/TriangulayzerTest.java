
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *I affirm that this program is entirely my own work and 
 * none of it is the work of any other person.
 * @author Gabriel Llanes
 * Instructor: Caryl Rahn 
 * COP 2210 U02 Thursday 11:00 a.m. lab
 */
public class TriangulayzerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a value for the length of the first side. ");
        int lengthA = input.nextInt();
        System.out.println("Enter a value for the length of the second side. ");
        int lengthB = input.nextInt();
        System.out.println("Enter a value for the length of the third side. ");
        int lengthC = input.nextInt();

        Triangulyzer triangle = new Triangulyzer(lengthA, lengthB, lengthC);
        
        System.out.println(triangle.getTriangleLengths());
        System.out.println(triangle.getTriangleType());
        if(triangle.isTriangle())
        {
            System.out.println("The area of the triangle is " + triangle.getTriangleArea());
        }
    }
    
}
