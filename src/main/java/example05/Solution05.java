/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Marcelino Pozo-Joseph
 */
/*
    PSEUDOCODE GOES HERE
    Basically write out step by step what ur codes doing.
 */
package example05;

import java.util.Scanner;

public class Solution05 {

    public static void main(String[] args)
    {
        int num1,num2,sum,difference,product,quotient;

        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number?");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("What is the second number?");
        num2 = Integer.parseInt(input.nextLine());

        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;
        System.out.println(num1+" + "+num2+" = "+sum+"\n"+
                           num1+" - "+num2+" = "+difference+"\n"+
                           num1+" * "+num2+" = "+product+"\n"+
                           num1+" / "+num2+" = "+quotient);
    }
}
