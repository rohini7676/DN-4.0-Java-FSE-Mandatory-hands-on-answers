import java.util.*;

public class SearchExample {

    public static int findUsingLinearSearch(Product[] items, int idToFind) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].id == idToFind) {
                return i;
            }
        }
        return -1;
    }

    public static int findUsingBinarySearch(Product[] items, int idToFind) {
        int start = 0;
        int end = items.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (items[middle].id == idToFind) {
                return middle;
            } else if (items[middle].id < idToFind) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] items = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Smartphone", "Electronics"),
            new Product(103, "Headphones", "Accessories"),
            new Product(104, "Backpack", "Travel"),
            new Product(105, "Desk Chair", "Furniture"),
            new Product(106, "Coffee Maker", "Appliances"),
            new Product(107, "Notebook", "Stationery"),
            new Product(108, "Pen Drive", "Electronics"),
            new Product(109, "Wireless Mouse", "Accessories"),
            new Product(110, "Shoes", "Footwear"),
            new Product(111, "Watch", "Accessories"),
            new Product(112, "Bookshelf", "Furniture"),
            new Product(113, "Sunglasses", "Fashion"),
            new Product(114, "T-shirt", "Clothing"),
            new Product(115, "Refrigerator", "Appliances"),
            new Product(116, "Gaming Console", "Electronics"),
            new Product(117, "Monitor", "Electronics"),
            new Product(118, "Water Bottle", "Travel"),
            new Product(119, "Wallet", "Fashion"),
            new Product(120, "LED Bulb", "Home Improvement")
        };

        Arrays.sort(items, Comparator.comparingInt(p -> p.id));

        int idToFind = 115;

        int result1 = findUsingLinearSearch(items, idToFind);
        System.out.println("Linear Search Index: " + result1);

        int result2 = findUsingBinarySearch(items, idToFind);
        System.out.println("Binary Search Index: " + result2);
    }
}
