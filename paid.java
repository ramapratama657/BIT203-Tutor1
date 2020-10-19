/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
import java.util.Scanner;

public class paid {
    public static void main(String[] args){
        double money;
        int survey;
        Scanner key=new Scanner(System.in);
        System.out.println("please enter how many surveys done: ");
        survey=key.nextInt();
        if(survey<5){
            money = survey*10.00; 
        }
        else{
            money = (survey/5*70.00)+survey % 5*10.00;
        }
        System.out.println("With " + survey + "done, you get " + money);
    }
}
