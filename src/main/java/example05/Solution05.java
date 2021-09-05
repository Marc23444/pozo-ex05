/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Marcelino Pozo-Joseph
 */
/*
    PSEUDOCODE
    -Create a scanner to grab user input, also create int's for both user inputs
    and to store solutions to those inputs
    -Prompt for and then store 2 numbers, these will be held as num1 and num2
        -To convert these from strings to ints maybe use .parseInt();
    -Finally calculate and display the sum, difference, producat and quotient
    -Make sure to display this in one .println() call, use proper formatting!!
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
