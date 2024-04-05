public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getName() {
        return itemName;
    }

    public int getPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }
}