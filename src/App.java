import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        while (true) {
            System.out.println("1 - Enqueue an order");
            System.out.println("2 - Dequeue an order");            
            System.out.println("3 - Show orders");
            System.out.println("4 - Peek");
            System.out.println("5 - Exit");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Insert the code:");
                    int code = Integer.valueOf(scanner.nextLine());
                    System.out.println("Insert client name");
                    String name = scanner.nextLine();
                    System.out.println("Aamount of bricks:");
                    int bricks = Integer.valueOf(scanner.nextLine());
                    list.enqueue(new Order(code, name, bricks));
                    break;
                case "2":
                    list.dequeue();
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
