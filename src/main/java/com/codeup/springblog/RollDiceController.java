package com.codeup.springblog;
import java.util.Scanner;
public class Lab5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub



        welcome();


    }
    public static void welcome() {
        System.out.println("Welcome to a Lucky (for me) Dice Game! \nFEELING LUCKY?!? Hope you brought lots of CASH!");{
        }

        int dice1=(int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);
        int sum= dice1 + dice2;

        System.out.println("Roll: total = " +sum);

        if (sum==2|| sum==3|| sum==12){
            System.out.println("Sorry with a " + sum + " You LOSE, Sorry"); }
        else if(sum==7 || sum==11) {
            System.out.println("Woah!!! With a " + sum + " You win!"); }
        else{
            if(sum==4 ||sum==5 ||sum==6 ||sum==8 ||sum==9 ||sum==10)
                dice1=(int)(Math.random()*6+1);
            dice2=(int)(Math.random()*6+1);}
        int roll2 = dice1 + dice2;}
    System.out.print("You rolled "+roll2+"  ");{
        while (roll2 !=7){
            if (roll == roll2);{
                System.out.println("You Win !");
                break;
            }else{

            }
        }
    }}

public class RollDiceController {


}
