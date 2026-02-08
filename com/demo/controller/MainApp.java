package com.demo.controller;

import com.demo.model.Item;
import com.demo.service.ItemService;

public class MainApp {

    public static void main(String[] args) {

        ItemService service = new ItemService();

        service.addItem(new Item(1, "Laptop", "Dell Laptop"));
        service.addItem(new Item(2, "Phone", "Samsung"));

        System.out.println(service.getById(1).getName());
    }
}
