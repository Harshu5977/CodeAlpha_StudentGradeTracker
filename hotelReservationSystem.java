import java.util.Scanner;

public class HotelReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String customerName = "";
        String roomType = "";
        boolean booked = false;

        while (true) {

            System.out.println("\n--- Hotel Reservation System ---");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Booking");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Rooms:");
                    System.out.println("1. Standard");
                    System.out.println("2. Deluxe");
                    System.out.println("3. Suite");
                    break;

                case 2:
                    System.out.print("Enter Name: ");
                    customerName = sc.nextLine();

                    System.out.println("Choose Room:");
                    System.out.println("1. Standard");
                    System.out.println("2. Deluxe");
                    System.out.println("3. Suite");

                    int room = sc.nextInt();

                    if (room == 1)
                        roomType = "Standard";
                    else if (room == 2)
                        roomType = "Deluxe";
                    else
                        roomType = "Suite";

                    booked = true;

                    System.out.println("Payment Successful!");
                    System.out.println("Room Booked Successfully!");
                    break;

                case 3:
                    booked = false;
                    customerName = "";
                    roomType = "";

                    System.out.println("Booking Cancelled Successfully!");
                    break;

                case 4:
                    if (booked) {
                        System.out.println("\nBooking Details");
                        System.out.println("Name: " + customerName);
                        System.out.println("Room Type: " + roomType);
                        System.out.println("Payment Status: Paid");
                    } else {
                        System.out.println("No Booking Found!");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
