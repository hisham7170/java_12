package day05;

public class salaryCalculatorTest {
    public static void main(String[] args) {
         double hourlyRate = 55,
                 weeklyHours = 45;
         double statTaxRate = 7.5;   //// implicit casting
        double federalTaxRate = 24.5;

        ////----------------------------------------

        double salaryBeforeTax = hourlyRate * weeklyHours * 52;

        double stateTax = salaryBeforeTax * statTaxRate / 100;

        double federalTax = salaryBeforeTax * federalTaxRate/ 100;

        double totalTax = stateTax + federalTax;


        double salaryAfterTax = salaryBeforeTax - totalTax;



        System.out.println( "Gross pay is $  " + salaryBeforeTax);
        System.out.println("federal tax is: " + federalTax);
        System.out.println("state tax is $" + stateTax);
        System.out.println( "Total tax is: $ " + totalTax);
        System.out.println( "Net income is: $ " + salaryAfterTax);
        System.out.println( "===============================");

        System.out.println("Gross pay is: $" + salaryBeforeTax +
                " \n Federal tax is: $ " + federalTax + "\nstate tax is $" +stateTax +
                "\nTotal tax is: $" + totalTax +"\nNet income is: $" + salaryAfterTax);




    }

}
 /*
     Warmup tasks:
     1.Create a class called SalaryCalculator.java
          1.1declare the following variables:
           hourlyRate, weeklyHours, stateTaxRate. federalTaxRat
1.2 use the given info in above variables to calculate the followings:

         1. salaryBeforeTax
         2. stateTax
         3. federalTax
         4. totalTax
          5. salaryAfterTax

        Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

             1.3 use print statement to print each of the above
              Ex: hourlyRate = $50

              weeklyHours   = 45

         stateTaxRate = 6 (given as percentage, you need to convert to decimal)
      federalTaxaRate = 26 (given as percentage, you need to convert to decimal)


      output:
      Gross pay is: $117000
      Federal tax is: $30420
      State tax is: $7020
      Total tax is:
      $37440
      Net income is: 79560



  */