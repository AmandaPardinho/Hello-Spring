package br.com.pards.hello.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private int qttStock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQttStock() {
        return qttStock;
    }

    public void setQttStock(int qttStock) {
        this.qttStock = qttStock;
    }
}
