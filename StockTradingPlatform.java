import java.util.Scanner;

public class StockTradingPlatform {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tcs = 0;
        int infosys = 0;
        int wipro = 0;

        while (true) {

            System.out.println("\n--- Stock Trading Platform ---");
            System.out.println("1. View Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. View Portfolio");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("TCS = ₹3500");
                    System.out.println("Infosys = ₹1500");
                    System.out.println("Wipro = ₹300");
                    break;

                case 2:
                    System.out.println("1. TCS");
                    System.out.println("2. Infosys");
                    System.out.println("3. Wipro");

                    System.out.print("Choose Stock: ");
                    int stock = sc.nextInt();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    if (stock == 1)
                        tcs += qty;
                    else if (stock == 2)
                        infosys += qty;
                    else if (stock == 3)
                        wipro += qty;

                    System.out.println("Stock Purchased Successfully!");
                    break;

                case 3:
                    System.out.println("\nYour Portfolio");
                    System.out.println("TCS Shares: " + tcs);
                    System.out.println("Infosys Shares: " + infosys);
                    System.out.println("Wipro Shares: " + wipro);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}