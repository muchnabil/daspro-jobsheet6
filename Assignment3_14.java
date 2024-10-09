import java.util.Scanner;

public class Assignment3_14 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        String brand;
        System.out.print("Input the brand name (Converse, Sketcher, Nike): ");
        brand = input14.nextLine();

        String type;
        int size, price;
        if (brand.equalsIgnoreCase("Converse")) {
            System.out.print("Input the type name (Slip on / High Top) : ");
            type = input14.nextLine();
            if (type.equalsIgnoreCase("slip on")) {
                System.out.print("Input the size (36 - 40) : ");
                    size = input14.nextInt();
                    price = 800000;
                    System.out.println("The price is Rp " + price);
            }
            if (type.equalsIgnoreCase("high top")) {
                System.out.print("Input the size (40 - 44) : ");
                    size = input14.nextInt();
                    price = 1200000;
                    System.out.println("The price is Rp " + price);
            }
        } else if(brand.equalsIgnoreCase("Sketcher")) {
            System.out.print("Input the type name (Woman / Man) : ");
            type = input14.nextLine();
            if (type.equalsIgnoreCase("woman")) {
                System.out.print("Input the size (36 - 41) : ");
                    size = input14.nextInt();
                    price = 1000000;
                    System.out.println("The price is Rp " + price);
            }
            if (type.equalsIgnoreCase("man")) {
                System.out.print("Input the size (41 - 44) : ");
                    size = input14.nextInt();
                    price = 1800000;
                    System.out.println("The price is Rp " + price);
            }
        } else if(brand.equalsIgnoreCase("Nike")) {
            System.out.print("Input the type name (Kids / Adult) : ");
            type = input14.nextLine();
            if (type.equalsIgnoreCase("kids")) {
                System.out.print("Input the size (36 - 40) : ");
                    size = input14.nextInt();
                    price = 750000;
                    System.out.println("The price is Rp " + price);
            }
            if (type.equalsIgnoreCase("adult")) {
                System.out.print("Input the size (40 - 44) : ");
                    size = input14.nextInt();
                    price = 1500000;
                    System.out.println("The price is Rp " + price);
            }
        } else {
            System.out.println("Invalid shoe brand");
        }
    }
}