/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
public class Point {
    private double x;
    private double y;
    
    public Point(double x, double y){
       this.x=x;
       this.y=y;
    }
    public Point(){
        this.x=0;
        this.y=0;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
}
