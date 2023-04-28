import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!. Three orders automatically enqueued:");
        System.out.println("Carlos, Roberto and Hugo.");
        list.enqueue(new Order(002, "Carlos", 500));
        list.enqueue(new Order(050, "Roberto", 200));
        list.enqueue(new Order(460, "Hugo", 450));
        list.showOrders();
        while (true) {
            System.out.println("1 - Enqueue order");
            System.out.println("2 - Process order");            
            System.out.println("3 - Show orders");
            System.out.println("4 - First in line");
            System.out.println("5 - Exit");
            System.out.print("Command: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Insert the code: ");
                    int code = Integer.valueOf(scanner.nextLine());
                    System.out.println("Insert client name: ");
                    String name = scanner.nextLine();
                    System.out.println("Aamount of bricks: ");
                    int bricks = Integer.valueOf(scanner.nextLine());
                    list.enqueue(new Order(code, name, bricks));
                    System.out.println("One order enqueued, updated orders:");
                    list.showOrders();
                    break;
                case "2":
                    list.dequeue();
                    System.out.println("One order processed, updated orders:");
                    list.showOrders();
                    break;
                case "3":
                    list.showOrders();
                    break;
                case "4":
                    list.peek();
            }
            if (input.equals("5")) {
                scanner.close();
                break;
            }

        }
    }
}
