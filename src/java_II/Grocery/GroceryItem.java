package java_II.Grocery;

public class GroceryItem {
    private String category;
    private String item;
    private int count;

    public GroceryItem(String category, String item, int count) {
        this.category = category;
        this.item = item;
        this.count = count;
    }

    public String toString() {
        return category + " " + item + " " + count;
    }
}
