package com.yash.springcore.assignments.Ques15;

public class Customer {
    int id;
    String custName;
    Item item;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void display() {
        System.out.println("id is = "+id);
        System.out.println("customer name = "+custName);
        System.out.println("item id = "+item.id);
        System.out.println("item name "+item.itemName);
        System.out.println("Item price = "+item.price);
        System.out.println("Category name is = "+item.cat.catName);
    }
}