import java.util.Scanner;

public class Assignment2_14 {
    public static void main(String[] args) {

        Scanner input14 = new Scanner(System.in);

        String category;
        int totalBook;

        System.out.print("Input the book category (Dictionary, Novel, Other) : ");
        category = input14.nextLine();

        System.out.print("Input the total of book bought: ");
        totalBook = input14.nextInt();

        double discount = 0;
        if(category.equalsIgnoreCase("dictionary"))
                if(totalBook > 2)
                    discount = 0.12;
                else
                discount = 0.10;
            else if(category.equalsIgnoreCase("novel"))
                discount = 0.7;
                    if(totalBook > 3)
                        discount =+ 0.1;
            else if(category.equalsIgnoreCase("other") && totalBook > 3)
                discount = 0.5;

        System.out.println("The discount is " + discount * 100 + "%");
        ;
    }
}