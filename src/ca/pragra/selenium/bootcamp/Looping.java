package ca.pragra.selenium.bootcamp;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        // for
        // while
        // do - while
        // print all odd numbers from 1 to 50;

//        for (int i = 1; i < 50 ; i = i+2) {
//            System.out.println(i);
//        }

//        for ( int i = 0, j = 0 ;   i < 5 && j < 2 ; i++ , j++ ) {
//            System.out.println("value of i ==> " + i );
//            System.out.println("value of j ==> " + j );
//        }

//        for ( int i = 0 ; i <  5;  i++ ) {
//
//            for( int j = 0; j < 3; j++) {
//                System.out.println(" I ==>" + i + "J ==> "+ j);
//            }
//
//        }

        // user will start number and end number
        // sum all the number between start and end
        // 0  , 5
        // 1+2+3+4

//        Scanner scanner =  new Scanner(System.in);
//        int startNum, endNum;
//        System.out.println("Please Key in Start Num:");
//        startNum = scanner.nextInt();
//        System.out.println("Please key in the End Num:");
//        endNum = scanner.nextInt();
//
//        int sum =0;
//        startNum++;
//        while(endNum>startNum) {
//           sum = sum+ startNum;
//           startNum++;
//        }
//
//        System.out.println("Sum is " + sum);
//

        int option = -1;
        Scanner scanner = new Scanner(System.in);

        while (option !=0) {
            // Menu
            System.out.println(" -----------------------------------------");
            System.out.println(" Menu - Please select an option");
            System.out.println(" 1 - For sum of 2 numbers");
            System.out.println(" 2 - For substraction of 2 numbers");
            System.out.println(" 3 - For division of 2 numbers");
            System.out.println(" 4 - For multiplication of 2 numbers");
            System.out.println(" 0 - For exit");
            option = scanner.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("key in number 1");
                    int num1 = scanner.nextInt();
                    System.out.println("key in number 1");
                    int num2 = scanner.nextInt();
                    System.out.println(num1+num2);
                }break;
                case 2: {
                    System.out.println("key in number 1");
                    int num1 = scanner.nextInt();
                    System.out.println("key in number 1");
                    int num2 = scanner.nextInt();
                    System.out.println(num1-num2);
                }break;
                case 3: {
                    System.out.println("key in number 1");
                    int num1 = scanner.nextInt();
                    System.out.println("key in number 1");
                    int num2 = scanner.nextInt();
                    System.out.println(num1/num2);
                }break;
                case 4: {
                    System.out.println("key in number 1");
                    int num1 = scanner.nextInt();
                    System.out.println("key in number 1");
                    int num2 = scanner.nextInt();
                    System.out.println(num1*num2);
                }break;
                default: {
                    if(option!=0){
                        System.out.println("****Key in the valid option*****");
                    }
                }
            }
        }





    }
}
