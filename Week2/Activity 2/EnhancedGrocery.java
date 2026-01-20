
import java.util.ArrayList;

public class EnhancedGrocery {

    //This class contains a product that is available in store
    public static class Product {

        public Product() {
        }

        public Product(String name, double price, String type) {
            productName = name;
            productPrice = price;
            productType = type;
        }
        String productName;
        double productPrice;
        String productType;
    }

    //This class contains a product taken by customers
    public static class Item {

        public Item(Product product, int quantity) {
            itemQuantity = quantity;
            itemTotal = product.productPrice * quantity;
        }
        String itemName;
        int itemQuantity;
        double itemPrice, itemTotal;

        public Item(Product product) {
        }

        public void print() {

        }

    }

    //This class contains a customer's info, receipt, and cart 
    public static class Customer {

        String customerName;
        double customerTotal, customerPay, customerChange;
        Cart customerCart;

        public Customer(String name) {
            customerName = name;
            customerCart = new Cart();
        }

        public void addToCart(Product product, int quantity) {
            customerCart.addItem(new Item(product, quantity));
        }

        public void removeFromCart(Product product) {
            customerCart.removeItem(new Item(product));
        }
    }

    //This class contains the items and the total of the items
    public static class Cart {

        ArrayList<Item> items;
        double total;

        public Cart() {
            items = new ArrayList<>();
            total = 0;
        }

        public void addItem(Item item) {
            items.add(item);
            total += item.itemTotal;
        }

        public void removeItem(Item item) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).itemName.equals(item.itemName)) {
                    items.remove(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("C2Tea", 16, "Drink"));
        products.add(new Product("Cocacola 200ml", 11, "Drink"));
        products.add(new Product("Cocacola 325ml", 16, "Drink"));
        products.add(new Product("Skyflakes", 8, "Snacks"));
        products.add(new Product("Ice", 3, "Misc"));

    }
}
