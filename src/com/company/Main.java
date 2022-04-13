package com.company;

public class Main
{
    public static void main(String[] args)
    {
	    // double price;
        // double shipping = 0
        //double total
        //Output “please enter the price of your item: “
        //Input price

        //if (price >= 100)
            //Output “Shipping cost: “ + shipping
        //else
            //shipping = price * 0.02
            //Output “Shipping cost: “ + shipping
        //end if
        //Output “Total cost: “ + (price + shipping)

        double price = 110.0;
        double shipping = 0;

        if (price >= 100)
        {
            System.out.println("Your total cost is " + price + "$. Your item costs " + price + "$, and your shipping costs " + shipping + "$");
        }
        else
        {
            shipping = price * 0.02;
            System.out.println("Your total cost is " + price  + shipping + "$. Your item costs " + price + "$, and your shipping costs " + shipping + "$");
        }
    }
}
