import java.util.Scanner;

public class ABC{
    int amount, total;

    void display() {
        Scanner Zu = new Scanner(System.in);
        System.out.println("Enter amount you earn: ");
        amount = Zu.nextInt();
        if (amount >= 15000) {
            total = amount + (10 * amount / 100);
        } else {
            total = amount + 1000;
        }
        System.out.println("Total earnings: " + total);
        Zu.close();
    }

    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.display();
    }
}