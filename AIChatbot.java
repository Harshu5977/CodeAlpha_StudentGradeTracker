import java.util.Scanner;

public class AIChatbot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("AI Chatbot Started! Type 'bye' to exit.");

        while (true) {

            System.out.print("You: ");
            String msg = sc.nextLine().toLowerCase();

            if (msg.equals("hi")) {
                System.out.println("Bot: Hello!");
            }
            else if (msg.equals("how are you")) {
                System.out.println("Bot: I am fine.");
            }
            else if (msg.equals("what is your name")) {
                System.out.println("Bot: I am a Java Chatbot.");
            }
            else if (msg.equals("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            }
            else {
                System.out.println("Bot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}