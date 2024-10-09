import java.util.Scanner;

public class Selection2Exp314 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        String category;
        int income, netSalary;
        double tax;

        System.out.print("Input category = ");
        category = input14.nextLine();
        System.out.print("Input income = ");
        income = input14.nextInt();

        if(category.equalsIgnoreCase("Worker")) {
            if (income <= 200000)
                tax = 0.1;
            else if (income <= 3000000)
                tax = 0.15;
            else
                tax = 0.2;
            netSalary = (int) (income - (tax * income));
            System.out.println("Net Salary = " + netSalary);
        }else if(category.equalsIgnoreCase("Businessman")) {
                if(income <= 2500000)
                    tax = 0.15;
                else if(income <= 3500000)
                    tax = 0.2;
                else
                    tax = 0.25;
            netSalary = (int) (income - (tax * income));
            System.out.println("Net Salary = " + netSalary);
        } else
            System.out.println("Invalid Category!");
    }
}