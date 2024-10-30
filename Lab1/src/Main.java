import sun.invoke.empty.Empty;

import java.io.FilterOutputStream;
import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // System.out.println(" ////////////////////1th////////////");
        //Write a Java program to print the sum (addition), multiply,
        // subtract, divide and remainder of
        //two numbers , takes two numbers as input
//        try {
//
//        System.out.println("Enter th first number: ");
//        int number1=input.nextInt();
//        System.out.println("Enter the second number: ");
//       int  number2 =input.nextInt();
//
//        System.out.println("the sum of tow numers is :"+(number1+number2));
//        System.out.println("the subtract  of tow numers is :"+(number1-number2));
//        System.out.println("the divide of tow numers is :"+(number1/number2));
//        System.out.println("the multiply  of tow numers is :"+(number1*number2));
//        }catch (InputMismatchException e){
//            System.out.println("we just asking for only numbers");
//        }
          System.out.println(" ////////////////////2th////////////");
//.        Write a Java program that takes a number as
//     input and prints its multiplication table up to 10.

//        int multi=0;
//        System.out.println("put number and i will give you the multiply : ");
//        int number=input.nextInt();
//        try {
//            checkmulti(number); }
//        catch (Exception e){
//            System.out.println(e.getMessage()); return;}
//        for (int i = 0; i <=10 ; i++) {
//            multi=i*number;
//            System.out.println(i + "X" + number + "=" + multi); }

//        System.out.println(" ////////////////////3th////////////");
//         Write a Java program to print the area and perimeter of a circle
//        System.out.println("enter the radius of a Circle that you have :");
//        double radius=input.nextDouble();
//        try {
//            checklligel(radius);
//        } catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        return; }
//        double area=0.0;
//        double  perimeter=0.0;
//        area = 3.14 * radius * radius;
//        perimeter=2 * 3.14 * radius;
//        System.out.println("Well the perimeter is :"+ perimeter );
//        System.out.println("And the Area:"+ area );

        //    System.out.println(" ////////////////////4th////////////");
        // Java program to find out the average of a set of integers
//        int numbertime;
//        int count = 1;
//      int number, averageF, sum = 0;
//       try {
//           System.out.println("Enter the number of how many time u want tho repet?");
//
//        numbertime = input.nextInt();
//        while (count <= numbertime)
//        {
//            System.out.println("Enter the number?");
//            number = input.nextInt();
//            sum =sum+number;
//            ++count;
//        }
//        System.out.println("The Average is:  "+sum/numbertime +" !");}
//       catch (ArithmeticException e){
//           System.out.println(e.getMessage());
//       } catch (InputMismatchException e){
//     System.out.println("Enter correct number");
//      }

        //    System.out.println(" ////////////////////5th////////////");
        //. Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.
//try {
//
//        System.out.println("Enter three numbers here ");
//        System.out.println("enter the first number ");
//        int first_number=input.nextInt();
//        System.out.println("enter the second number ");
//        int second_number=input.nextInt();
//        System.out.println("enter the therd number ");
//        int therd_number=input.nextInt();
//        System.out.println("==========");
//       int sum2= first_number+second_number;
//       if(sum2==therd_number){
//           System.out.println("The result is: True ");}
//           else System.out.println("The result is: false "); }
//catch (InputMismatchException e){
//    System.out.println(e.getMessage());
//} finally {
//    System.out.println(" The End ....");
//}

        //    System.out.println(" ////////////////////6th////////////");
//          try {
//            System.out.println("Enter a word and I will reverse it for you :) ");
//            String word = input.nextLine();
//            if (!word.matches("[a-zA-Z]+")) {
//                throw new IllegalArgumentException("Please enter only letters (no numbers or symbols).");
//            }
//
//            StringBuilder sb = new StringBuilder(word);
//            System.out.println("The reversed word is: " + sb.reverse());
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        //    System.out.println(" ////////////////////7th////////////");
        //Java program to check whether the given number is even or odd
//        try{
//            System.out.println("Enter number: ");
//        int number=input.nextInt();
//         if(number%2==0){
//             System.out.println("the number is even ! "); }
//          else System.out.println("the number is odd ! ");}
//          catch (InputMismatchException e){
//            System.out.println("Enter correct number ");
//        }

        //    System.out.println(" ////////////////////8th////////////");
        // Java program to convert the temperature in Centigrade to Fahrenheit
//°F = (c * 9/5) + 32;
//        try{
//        System.out.println("Enter temperature in Centigrade ");
//       double celios=input.nextDouble();
//        double Fahrenheit= ( celios* 9/5) + 32;
//        System.out.print("Temperature in Fahrenheit is:  "+Fahrenheit );}
//        catch (InputMismatchException  e){
//            System.out.println("Enter only Number !");
//        }

        //    System.out.println(" ////////////////////9th////////////");
//        Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.
//        try{
//        System.out.println("Input a string:");
//        String name=input.nextLine();
//            Stringcheck(name);
//        System.out.println("Input a number: ");
//        int number_indix=input.nextInt();
//        System.out.println("The index is :  "+name.charAt(number_indix));}catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        //    System.out.println(" ////////////////////10th////////////");

        //Write a Java program to print the area and perimeter of a rectangle
//try{
//        System.out.println("Enter Width");
//        double Width =input.nextDouble();
//        checklligel(Width);
//        System.out.println("Enter Height");
//        double Height =input.nextDouble();
//        checklligel(Height);
//        double Area=(Width*Height);
//        String result =String.format("%.2f",Area);
//        double Perimeter=2*(Width+Height);
//        System.out.println("Area is "+Width +"*"+ Height +"= " + Area);
//        System.out.println("Perimeter is:  "+ Perimeter);}
//catch (IllegalArgumentException e){
//    System.out.println(e.getMessage());
//
//}

        //    System.out.println(" ////////////////////11th////////////");
        // Write a Java program to compare two numbers.
//        try{
//        System.out.println("Enter two number and i will compare :");
//        System.out.println("enter the first one :");
//        int first=input.nextInt();
//        System.out.println("enter the second one :");
//        int second=input.nextInt();
////        25 != 39 test
////         25 < 39 test
////        25 <= 39 test
//        while (first!=second){
//            System.out.println(first+"!="+second);
//            break;
//        }
//        while (first<second){
//            System.out.println(first+"<"+second);
//            break;
//        }
//        while (first<=second){
//            System.out.println(first+"<="+second);
//            break;
//        }}catch (InputMismatchException e){
//            System.out.println("ONLY numbers and don't but coma");
//        }
        //    System.out.println(" ////////////////////12th////////////");
//Write a Java program to convert seconds to hours, minutes and seconds.
//       try {
//
//        System.out.println(" now let's convert our seconds ! ");
//        int allseconds=input.nextInt();
//        checkmulti(allseconds);
//        ////////how to convert in math
//int hours = allseconds / 3600;
//int minutes = (allseconds % 3600) / 60;
//int seconds = allseconds % 60;
////Input seconds: 86399
////23:59:59
//        System.out.println(hours+ ": "+ minutes+ ": "+ seconds);}catch (InputMismatchException e){
//           System.out.println("put only pure number ");
//       }
//       catch (Exception e){
//           System.out.println(e.getMessage());
//       }

        //    System.out.println(" ////////////////////13th////////////");
        //Write a Java program that accepts four integers
        // from the user and prints equal if all
        //four are equal, and not equal otherwise.
//        try{
//        System.out.println("i will print for you if all your numbers is equal  or not");
//        System.out.println("1th number :"); int number1=input.nextInt();
//        System.out.println("2th number :"); int number2=input.nextInt();
//        System.out.println("3th number :"); int number3=input.nextInt();
//        System.out.println("4th number :"); int number4=input.nextInt();
//        if(number1==number2&&number1==number3&&number1==number4){
//            System.out.println("all the four are equal");}
//        else if (number2==number1&&number2==number3&&number2==number4) {
//            System.out.println("all the four are equal"); }
//        else if (number3==number1&&number3==number2&&number3==number4) {
//            System.out.println("all the four are equal");
//        }
//        System.out.println("thay are not equal");}
//        catch (InputMismatchException e){
//            System.out.println("put only pure number ");
//        }
        //    System.out.println(" ////////////////////14th////////////");
//        Write a Java program that reads an integer and check
//        whether it is negative, zero, or
//        positive.
//        try{
//        System.out.println("Enter integer and check  whether it is negative, zero, or positive :) " );
//             int number =input.nextInt();
//             if(number==0){
//                 System.out.println(" the number is zero");}
//             else if (number>0) {  System.out.println(" the number is positive");}
//             else System.out.println(" the number is negative");}
//        catch (InputMismatchException e){
//            System.out.println("ONLY numbers and don't but coma");
//        }
        //    System.out.println(" ////////////////////15th////////////");
//        Write a program to enter the numbers till the user wants and at the end it
//        should display the count of positive, negative and zeros entered (End loop use -1 ,
//                Don’t count -1).
//        int pcount=0; int nicount=0; int zcount=0;
//try {
//
//
//        while (true){
//            System.out.println("enter any number and -1 to stop");
//            int n=input.nextInt();
//            if(n==-1) {
//                break;
//            }
//
//            if(n>0){pcount++;} /////
//            else if (n<0) {nicount++;}
//              else zcount++;
//        }
//        System.out.println("the postive "+ pcount);
//        System.out.println("the nigative "+nicount);
//        System.out.println("the zero is "+zcount);}catch (InputMismatchException e)
//{
//    System.out.println("ONLY numbers and don't but coma" );
//}
//finally {
//    System.out.println("The End....");
//}
        //    System.out.println(" ////////////////////16th////////////");
        //Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed
//try {
//        System.out.println("Enter number and i will revers it :");
//        String reversnumber=input.nextLine();
//        StringBuilder Sb  =new StringBuilder(reversnumber);
//        System.out.println("The revers of the number is "+Sb.reverse());}
//catch (InputMismatchException e){
//    System.out.println("ONLY numbers and don't but coma");
//}
        //    System.out.println(" ////////////////////17th////////////");
//        Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered.
//
       // try {
//
//        int number;
//        int largest = 0;
//        int smallest = 0;
//
//        do {
//            System.out.println("Please enter any number you want or 0 to stop");
//            number = input.nextInt();
//            if (number != 0) {
//                if (number < smallest) {
//                    smallest = number;
//                }
//                if (number > largest) {
//                    largest = number;
//                }
//            }
//        } while (number != 0);
//
//        System.out.println("The largest number is: " + largest);
//        System.out.println("The smallest number is: " + smallest);}
//        catch (InputMismatchException e){
//            System.out.println("Enter correct number");
//        }
//
//        //    System.out.println(" ////////////////////18th////////////");
//        //Determine and print the number of times the character ‘a’ appears in the input
//        //entered by the user.
        try{
        System.out.println("Enter any character : ");
        String word = input.nextLine();
        Stringcheck(word);
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)=='a') {
                count++;
            }
        }System.out.println("Number of a's: " +count);}
        catch (Exception e){
            System.out.println(e.getMessage());
        }
//


    }
    public static void checkmulti(int m)throws Exception{
        if(m==0){ throw new Exception("don't but 0 ever !"); }
    }
    public static void checklligel(double number)throws IllegalArgumentException  {
        if (number < 0) {
            throw new IllegalArgumentException("can't be nigative");
        }
    }
public static void Stringcheck(String word)throws Exception{
        if(word.length()<1){ throw new Exception("please enter more words");}
}

}
