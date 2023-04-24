package ss16_binary_file_serialization.bai_tap.quan_ly_san_pham.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String code;
    private String name;
    private String price;
    private String items;
    private String describe;
    public Product(){

    }

    public Product(String code, String name, String price, String items, String describe) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.items = items;
        this.describe = describe;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", items='" + items + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
