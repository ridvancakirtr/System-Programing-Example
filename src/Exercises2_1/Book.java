package Exercises2_1;

public class Book {
    private String name;
    private double price;
    private String authorName;
    private String authorGender;
    private int quantityStock;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Book(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorGender() {
        return authorGender;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorGender(String authorGender) {
        this.authorGender = authorGender;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }
}
