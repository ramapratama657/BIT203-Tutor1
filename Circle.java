/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
public class Circle {
    public Point centre = new Point();
    private double radius;
    
    public Circle(){
        this.centre.setX(0);
        this.centre.setY(0);
        this.radius=0;
    }
    
    public Circle(double rad, double x, double y){
        this.radius = rad;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public double setRadius(double rad){
        return this.radius = rad;
    }
}
