import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        ItemToPurchase item1 = new ItemToPurchase();
        System.out.println("Item 1\nEnter the item name: ");
        item1.setName(scnr.nextLine());
        System.out.println("Enter the item price: ");
        item1.setPrice(Integer.parseInt(scnr.nextLine()));
        System.out.println("Enter the item quantity: ");
        item1.setQuantity(Integer.parseInt(scnr.nextLine()));

        scnr.nextLine();

        ItemToPurchase item2 = new ItemToPurchase();
        System.out.println("Item 2\nEnter the item name: ");
        item2.setName(scnr.nextLine());
        System.out.println("Enter the item price: ");
        item2.setPrice(Integer.parseInt(scnr.nextLine()));
        System.out.println("Enter the item quantity: ");
        item2.setQuantity(Integer.parseInt(scnr.nextLine()));

        int price1 = item1.getPrice() * item1.getQuantity();
        int price2 = item2.getPrice() * item2.getQuantity();

        System.out.println("TOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + price1);
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + price2);
        System.out.println("Total: $" + (price1 + price2));

        scnr.close();
    }
}
