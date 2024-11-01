package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model;

import java.util.Date;

public class Product {
    private float productId;
    private String name;
    private Date dateSupplied;
    private int quantityInStock;
    private double unitPrice;

    public Product() {
    }

    public Product(float productId) {
        this.productId = productId;
    }

    public Product(float productId, String name, Date dateSupplied, int quantityInStock, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    public float getProductId() {
        return productId;
    }

    public void setProductId(float productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateSupplied() {
        return dateSupplied;
    }

    public void setDateSupplied(Date dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String toJson() {
        return "{" +
                "\"productId\":" + productId + "," +
                "\"name\":\"" + name + "\"," +
                "\"dateSupplied\":\"" + dateSupplied + "\"," +
                "\"quantityInStock\":" + quantityInStock + "," +
                "\"unitPrice\":" + unitPrice +
                "}";
    }

    public String toXML() {
        return "<product>" +
                "<productId>" + productId + "</productId>" +
                "<name>" + name + "</name>" +
                "<dateSupplied>" + dateSupplied + "</dateSupplied>" +
                "<quantityInStock>" + quantityInStock + "</quantityInStock>" +
                "<unitPrice>" + unitPrice + "</unitPrice>" +
                "</product>";
    }

    public String toCSV() {
        return productId + "," + name + "," + dateSupplied + "," + quantityInStock + "," + unitPrice;
    }
}
