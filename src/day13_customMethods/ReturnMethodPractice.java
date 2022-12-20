package day13_customMethods;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        System.out.println(   isOdd(100));

        int num = 200 ;
        if (isEven(num)){
            System.out.println(num + "is even number ");
        }else {
            System.out.println(num + "is odd number ");
        }


    }

    public static boolean isOdd(int num){
        return (num % 2 != 0 ) ?true : false ;

    }


    public static boolean isEven(int num ){
        return !isOdd(num);
    }
}
/*
Create a method named isOdd, that can return true if a number is an odd number
Create a method named sEven, that can return true if a number is an even number

Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */