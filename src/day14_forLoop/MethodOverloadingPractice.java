package day14_forLoop;

public class MethodOverloadingPractice {

    public static void main(String[] args) {
        System.out.println(      sum(10,20));

        System.out.println(   sum(10,20,30));


    }
    public static int sum(int num1 , int num2){
        return num1 + num2;

    }

    public static int sum(int num1 , int num2 , int num3){
        return sum(num1,num2)+num3;
    }

    public static int sum1 ( int num1, int num2,int num3 ){
        return sum(num1,num2)+num3;

    }
    public static int sum1 ( int num1, int num2,int num3 , int num4){
        return sum(num1,num2+num3) + num4;
    }


}
