package ca.pragra.selenium.bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int code ;
        // We have 100 contries
        // user will give your contry code
        // you need to print the country name
        // example user give you "IN"
        // you should print INDIA
        // IN = India , US  = United State of America, CA = Canada
        // AU = Australia , NZ = New Zeland

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entry the country code: ");
        code = scanner.nextInt();

        switch (code) {
            case 1: {
                System.out.println("India");
            }
            case 2: {
                System.out.println("AUSTRALIA");
            }break;
            case 3 :{
                System.out.println("New Zealand");
            }break;
            case 4: {
                System.out.println("United Kingdom");
            }break;
            case 5: {
                System.out.println("Canada");
            }break;
            case 6 :{
                System.out.println("United States");
            }break;
            default:{
                System.out.println("No Match found");
            }
        }

    }




}
