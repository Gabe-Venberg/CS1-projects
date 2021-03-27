/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel.venberg
 */
public class circleCalc {
    public static void main(String[] args){
        double radius=3.4;
        double area;
        double perimeter;
        
        perimeter=(radius*2*Math.PI);
        area=(Math.pow(radius, 2)*Math.PI);
        
        System.out.println("The perimeter is "+perimeter);
        System.out.println("The area is "+area);
    }
}
