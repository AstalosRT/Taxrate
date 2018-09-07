import java.util.Scanner;

public class Taxrate
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double salary;
        double age;
        double childs;
        double discount;
        double price;
       
        System.out.println("What is your salary?");
        salary = scan.nextInt();
        System.out.println("What is your age?");
        age = scan.nextInt();
        System.out.println("How many dependants do you have?");
        childs = scan.nextInt();
        if (salary <= 10000)
        {
            price = 0;
        }
        else if (salary <= 25000)
        {
            price = salary/10;
        }
        else if (salary <= 75000)
        {
            price = salary/20;
        }
        else if (salary <= 250000)
        {
            price = salary/30;
        }
        else
        {
            price = salary/50;
        }

        if (childs <= 2)
        {
            price = price-1000;
        }
        else
        {
            price = price - (childs-2)*500 + 1000;
        }

        if (age <= 15)
        {
            price = price*.50;
        }
        else if (age <= 21)
        {
            price = price*.75;
        }
        else if (age <= 63)
        {
            
        }
        else if (age <= 72)
        {
            price = price*.67;
        }
        else if (age <= 80)
        {
            price = price*.34;
        }
        else
        {
            price = 0;
        }
    
    }
}