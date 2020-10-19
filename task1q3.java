/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
import java.util.*;
public class task1q3 {
    public static void main(String[] args){
        Point a = new Point();
        Circle b = new Circle();
        
        Scanner inp = new Scanner(System.in);
        System.out.println("Input Nilai x: ");
        a.setX(inp.nextDouble());
        
        System.out.println("Input nilai y: ");
        a.setY(inp.nextDouble());
        
        System.out.println("Input nilai lingkaran(x): ");
        b.centre.setX(inp.nextDouble());
        
        System.out.println("Input nilai lingkaran(y): ");
        b.centre.setY(inp.nextDouble());
        
        System.out.println("Input nilai radius: ");
        b.setRadius(inp.nextDouble());
        
        double c = a.getX() - b.centre.getX();
        double d = a.getY() - b.centre.getY();
        double e = Math.sqrt(Math.pow(c,2)+ Math.pow(d,2));
        
        if(e==b.getRadius()){
            System.out.println("Point is on the circle");
        }
        else if(e<b.getRadius()){
            System.out.println("Point is inside the circle");
        }
        else{
            System.out.println("Point is outside the circle");
        }
    }
}
