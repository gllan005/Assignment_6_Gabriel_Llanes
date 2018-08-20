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
public class Triangulyzer {
    private int lengthA;
    private int lengthB;
    private int lengthC;
    
    public Triangulyzer(int lengthA, int lengthB, int lengthC)
    {
    
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }
    
    //Method to return a string containing all three sides of the triangle
    public String getTriangleLengths()
    {
        return "The lengths of each side are "+lengthA+" "+lengthB+" "
                +lengthC+".";
    }
    
    //Method to return Equilateral boolean for extra credit
    public boolean isEquilateral()
    {
        if(lengthA == lengthB){
            if(lengthB == lengthC){
            return true;
            }
        }
                return false;    
    }
    
    //Method to return Isosceles boolean for extra credit
    public boolean isIsosceles()
    {
        if(lengthA == lengthB){
            if(lengthB != lengthC){
                return true;
            }
        }
            else{
                if(lengthA == lengthC){
                    return true;
                }
            }
                    return false;
    }
    
    //Method to return if user values form a triangle boolean
    public boolean isTriangle()
    {
        if(lengthA > (lengthB + lengthC) || lengthB > (lengthA + lengthC)
                || lengthC > (lengthA + lengthB))
        {
            return false;
        }
        else
        {    
            return true;
        }
    }
        
    
    // Method to return the type of triangle
    public String getTriangleType()
    {
        
        //Check if side length values for a triangle
        if(!isTriangle()){
        return "The length values of the sides do not form a triangle.";
        } 
        else {
        
        //return when it is equilateral
        if(isEquilateral()){
        return "Equilateral";
        } 
        
        //return when it is isosceles and if its right, obtuse, or acute
            else if(isIsosceles())
            {
                if((lengthA*lengthA)+(lengthB*lengthB)==(lengthC*lengthC)){
                    return "Right Isosceles Triangle.";
                } 
                else if((lengthA*lengthA)+(lengthB*lengthB) < (lengthC*lengthC)){
                    return "Obtuse Isosceles Triangle.";
                }
                else{
                    return "Acute Isosceles Triangle.";
                }
            }
               
        //return when its scalene right, obtuse or acute
        else
        {
            if((lengthA*lengthA)+(lengthB*lengthB)==(lengthC*lengthC)){
                return "Right Triangle.";
            } 
            else if((lengthA*lengthA)+(lengthB*lengthB) < (lengthC*lengthC)){
                return "Obtuse Triangle.";
            }
            else{
                return "Acute Triangle.";
            }
        }
      }
    }


    //Method that computes and returns the area using Heron's formula
    public double getTriangleArea()
    {
        double s = (lengthA + lengthB + lengthC)/(2.0);
        return Math.sqrt(s*(s - lengthA)*(s - lengthB)*(s - lengthC));
    }
   
}
